package KDMinh;

import VTNgoc.AmountSold;
import java.util.*;

/*
 * @author: KDMinh
 * @since: 12/7/2023 4:57 PM
 * @description: Cấu trúc dữ liệu: AVL-BST
 * @update:
 */
public class AmountSoldManagerTree {

    public static class AmountSoldNode {

        String key;
        //name
        AmountSold AmountSold;
        AmountSoldNode parent;
        AmountSoldNode left;
        AmountSoldNode right;

        public AmountSoldNode(String key, AmountSold AmountSold, AmountSoldNode parent, AmountSoldNode left, AmountSoldNode right) {
            this.key = key;
            this.AmountSold = AmountSold;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public String getKey() {
            return key;
        }

        public AmountSold getAmountSold() {
            return AmountSold;
        }

        public AmountSoldNode getParent() {
            return parent;
        }

        public AmountSoldNode getLeft() {
            return left;
        }

        public AmountSoldNode getRight() {
            return right;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public void setAmountSold(AmountSold AmountSold) {
            this.AmountSold = AmountSold;
        }

        public void setParent(AmountSoldNode parent) {
            this.parent = parent;
        }

        public void setLeft(AmountSoldNode left) {
            this.left = left;
        }

        public void setRight(AmountSoldNode right) {
            this.right = right;
        }

        private boolean isLeaf() {
            return this.left == null && this.right == null;
        }

        private boolean hasParent() {
            return this.parent != null;
        }

        @Override
        public String toString() {
            return AmountSold.toString();
        }

        private void swap(AmountSoldNode node) {
            String tempKey = this.key;
            AmountSold tempAmountSold = this.AmountSold;

            this.setKey(node.getKey());
            this.setAmountSold(node.getAmountSold());

            node.setKey(tempKey);
            node.setAmountSold(tempAmountSold);

        }

        private int size() {
            int total = 0;
            if (this.left != null) {
                total += this.left.size();
            }
            if (this.right != null) {
                total += this.right.size();
            }

            return 1 + total;
        }

        private AmountSoldNode findMin() {
            if (this.left != null) {
                return this.left.findMin();
            }

            return this;
        }

        private AmountSoldNode findMax() {
            if (this.right != null) {
                return this.right.findMax();
            }

            return this;
        }

        private int getDistance() {
            if (isLeaf()) {
                return 0;
            }

            if (left != null && right != null) {
                return left.height() - right.height();
            }

            if (left != null) {
                return left.height();
            }

            return -right.height();
        }

        private int height() {
            if (isLeaf()) {
                return 1;
            }
            if (this.left != null && this.right != null) {
                return 1 + Math.max(left.height(), right.height());
            }
            if (left != null) {
                return 1 + left.height();
            }
            return 1 + right.height();
        }
    }

    private AmountSoldNode root = null;

    public AmountSoldManagerTree() {
    }

    public boolean isEmpty() {
        return root == null;
    }

    public AmountSoldNode getRoot() {
        return root;
    }

    public AmountSoldNode get(String key) {
        AmountSoldNode curNode = getRoot();

        while (curNode != null) {
            if (curNode.getKey().equals(key)) {
                return curNode;
            } else if (curNode.getKey().compareTo(key) < 0) {
                curNode = curNode.right;
            } else if (curNode.getKey().compareTo(key) > 0) {
                curNode = curNode.left;
            }
        }

        return null;
    }

    private AmountSold get(int i) {
        if (i < 0 || i >= size()) {
            return null;
        }

        if (isEmpty()) {
            return null;
        }

        return get(i, root).getAmountSold();
    }

    private AmountSoldNode get(int i, AmountSoldNode curNode) {
        LinkedList<AmountSoldNode> list = new LinkedList<>();
        getFirstINode(i + 1, curNode, list);

        return list.get(i);
    }

    public AmountSold findMin() {
        if (isEmpty()) {
            return null;
        }

        return root.findMin().getAmountSold();
    }

    public AmountSold findMax() {
        if (isEmpty()) {
            return null;
        }

        return root.findMax().getAmountSold();
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }

        return root.size();
    }

    public boolean isContain(String key) {
        return isContain(root, key);
    }

    private boolean isContain(AmountSoldNode node, String key) {
        if (isEmpty()) {
            return false;
        }

        if (node.getKey().compareTo(key) == 0) {
            return true;
        }

        if (node.getKey().compareTo(key) > 0) {
            if (node.getLeft() != null) {
                return isContain(node.getLeft(), key);
            }
            return false;
        }

        if (node.getRight() != null) {
            return isContain(node.getRight(), key);
        }
        return false;
    }

    public void add(String key, AmountSold data) {
        AmountSoldNode node = new AmountSoldNode(key, data, null, null, null);

        if (root == null) {
            root = node;
        } else {
            AmountSoldNode addedNode = add(root, node);

            // addedNode ở đây là node lá (nếu là node được thêm) hoặc node cuối cùng mà hàm add(...) chạy đến.
            // Nếu là node cuối cùng, tức là không có gì thay đổi, hàm checkDown(...) ở dưới sẽ thực hiện nhưng không làm thay đổi gì.
            // Nếu là node mới, hàm checkDown() sẽ kiểm tra xem có sự thay đổi nào không và cân bằng lại nếu cần.
            checkDown(addedNode);
        }
    }

    private AmountSoldNode add(AmountSoldNode parent, AmountSoldNode AmountSoldNode) {

        if (AmountSoldNode.key.compareTo(parent.key) < 0) {
            if (parent.left == null) {
                parent.setLeft(AmountSoldNode);
                AmountSoldNode.setParent(parent);

                return parent.left;
            } else {
                return add(parent.left, AmountSoldNode);
            }
        } else if (AmountSoldNode.key.compareTo(parent.key) > 0) {
            if (parent.right == null) {
                parent.right = AmountSoldNode;
                AmountSoldNode.parent = parent;

                return parent.right;
            } else {
                return add(parent.right, AmountSoldNode);
            }
        }

        return parent;
    }

    public void remove(String key) {
        if (!isEmpty()) {

            AmountSoldNode node = remove(key, root);
            if (node == null) {
                return;
            }

            checkDown(node);
        }
    }

    private AmountSoldNode remove(String key, AmountSoldNode curNode) {

        if (curNode.key.compareTo(key) == 0) {

            if (curNode.isLeaf()) {
                AmountSoldNode p = curNode.parent;
                if (p != null) {
                    if (p.left == curNode) {
                        p.left = null;
                    } else {
                        p.right = null;
                    }
                    curNode.parent = null;

                    if (root == curNode) {
                        root = null;
                    }
                    return p;
                }
            } else if (curNode.left != null && curNode.right != null) {

                AmountSoldNode min = curNode.right.findMin();
                curNode.swap(min);
                remove(key, curNode.right);
            } else {

                if (curNode.left != null) {
                    curNode.swap(curNode.left);
                    return remove(key, curNode.left);
                } else {
                    curNode.swap(curNode.right);
                    return remove(key, curNode.right);
                }
            }

        } else if (curNode.key.compareTo(key) > 0 && curNode.left != null) {
            return remove(key, curNode.left);
        } else if (curNode.key.compareTo(key) < 0 && curNode.right != null) {
            return remove(key, curNode.right);
        }

        return null;
    }

    public List<AmountSold> getInOrderList() {
        return getInOrderList(getRoot(), new ArrayList<>());
    }

    private List<AmountSold> getInOrderList(AmountSoldNode node, List<AmountSold> AmountSoldList) {
        if (node == null) {
            return AmountSoldList;
        }

        if (node.getLeft() != null) {
            getInOrderList(node.getLeft(), AmountSoldList);
        }

        AmountSoldList.add(node.AmountSold);

        if (node.getRight() != null) {
            getInOrderList(node.getRight(), AmountSoldList);
        }

        return AmountSoldList;
    }

    public void displayInOrderList() {
        List<AmountSold> AmountSoldList = getInOrderList();

        System.out.println(AmountSoldList);
    }

    public static void sortAmountSold(List<AmountSold> list, boolean desc) {

        radixSort(list, desc);
    }

    public static List<AmountSold> sortAmountSoldList(List<AmountSold> list, boolean desc) {

        radixSort(list, desc);
        return list;
    }

    private static void sort(List<AmountSold> list, int low, int high, boolean desc) {

        if (low < high) {
            int mid = (low + high) / 2;

            sort(list, low, mid, desc);
            sort(list, mid + 1, high, desc);

            merge(list, low, mid, high, desc);
        }
    }

    private static void merge(List<AmountSold> list, int low, int mid, int high, boolean desc) {
        int n = high - low + 1;
        AmountSold[] b = new AmountSold[n];
        int left = low, right = mid + 1, bIdx = 0;

        while (left <= mid && right <= high) {
            if (!desc) {
                if (list.get(left).getAmountSold() <= list.get(right).getAmountSold()) {
                    b[bIdx++] = list.get(left++);
                } else {
                    b[bIdx++] = list.get(right++);
                }
            } else {
                if (list.get(left).getAmountSold() >= list.get(right).getAmountSold()) {
                    b[bIdx++] = list.get(left++);
                } else {
                    b[bIdx++] = list.get(right++);
                }
            }
        }

        while (left <= mid) {
            b[bIdx++] = list.get(left++);
        }
        while (right <= high) {
            b[bIdx++] = list.get(right++);
        }

        for (int i = 0; i < n; i++) {
            list.set(low + i, b[i]);
        }
    }

    public List<AmountSold> search(String name) {
        return new ArrayList<>(searchElementName(name));
    }

    public List<AmountSold> searchElementName(String name) {
        List<AmountSold> list = getInOrderList();
        List<AmountSold> AmountSoldList = new ArrayList<>();

        for (AmountSold product : list) {
            if (product.getMaMay().toLowerCase().contains(name.toLowerCase())) {
                AmountSoldList.add(product);
            }
        }

        return AmountSoldList;
    }

    private void checkDown(AmountSoldNode node) {

        while (node != null) {
            int curDistance = node.getDistance();
            if (curDistance == 2) {
                AmountSoldNode left = node.left;
                int leftDistance = left.getDistance();
                if (leftDistance == -1) {
                    rotateLeft(left);
                }
                rotateRight(node);

            } else if (curDistance == -2) {
                AmountSoldNode right = node.right;
                int rightDistance = right.getDistance();
                if (rightDistance == 1) {
                    rotateRight(right);
                }
                rotateLeft(node);
            }

            if (node.hasParent()) {
                node = node.getParent();
            } else {
                break;
            }
        }
    }

    private void updateRoot() {
        if (isEmpty()) {
            return;
        }

        while (root.hasParent()) {
            root = root.getParent();
        }
    }

    private void rotateLeft(AmountSoldNode node) {
        AmountSoldNode parent = node.getParent();

        AmountSoldNode right = node.getRight();
        AmountSoldNode leftOfRight = right.left;

        right.setParent(parent);
        if (parent != null) {
            if (node == parent.left) {
                parent.setLeft(right);
            } else {
                parent.setRight(right);
            }
        }

        node.setParent(right);
        right.setLeft(node);

        node.setRight(leftOfRight);
        if (leftOfRight != null) {
            leftOfRight.setParent(node);

        }

        updateRoot();
    }

    private void rotateRight(AmountSoldNode node) {
        AmountSoldNode parent = node.getParent();

        AmountSoldNode left = node.getLeft();
        AmountSoldNode rightOfLeft = left.right;

        left.setParent(parent);
        if (parent != null) {
            if (node == parent.left) {
                parent.setLeft(left);
            } else {
                parent.setRight(left);
            }
        }

        node.setParent(left);
        left.setRight(node);

        node.setLeft(rightOfLeft);
        if (rightOfLeft != null) {
            rightOfLeft.setParent(node);
        }

        updateRoot();
    }

    private void getFirstINode(final int i, AmountSoldNode curNode, List<AmountSoldNode> list) {
        if (curNode == null) {
            return;
        }

        if (i == list.size() - 1) {
            return;
        }

        if (curNode.left != null) {
            getFirstINode(i, curNode.left, list);
        }

        if (i > list.size()) {

            list.add(curNode);
        }

        if (i > list.size() && curNode.right != null) {
            getFirstINode(i, curNode.right, list);
        }

    }
     // @author: KDMinh
    /* @description:
        - Đây là thuật toán Radix Sort được phân công cho KDMinh thực hiện.
        - Mục đích của thuật toán sort này là chia nhỏ vấn đề ra và thực hiện sắp xếp trên các trường hợp con, để đảm bảo tính ổn định (thứ tự của 2 phần tử có cùng
        + giá trị được so sánh phải không đổi sau khi sắp xếp) các trường hợp nhỏ hơn cần được sắp xếp bằng thuật toán sắp xếp ổn định (stable sort).
        - Cách chia nhỏ vấn đề ở Radix Sort chính là: với các số nguyên, ta lấy phần tử tại từng hàng: đơn vị, chục, trăm, nghìn... và sắp xếp trên đó.
        - Vì thuật toán sắp xếp bên trong là ổn định nên sau mỗi lần sắp xếp các phần tử dần được sắp về đúng vị trí mà không bị lẫn vào nhau.
        - Có thể hiểu, theo quy nạp, sau k lần sắp xếp các trường hợp chia nhỏ, k phần tử đầu tiên (hoặc cuối cùng) đã được sắp đúng vị trí của nó.
        + Ở lần sort kế tiếp, các phần tử thực hiện sắp xếp lại, nếu giá trị 2 đối tượng bằng nhau thì vị trí tương quan không đổi, nếu không hiển nhiên sẽ thay đổi

        - Độ phức tạp thời gian: O(k * (n + d)) với k là độ dài (số chữ số) của giá trị nguyên lớn nhất (trong từng trường hợp), d = 10, n là số phần tử cần sắp xếp.
        - Độ phức tạp không gian: O(n + d)

        - So sánh với thuật toán sắp xếp ổn định hiệu quả khác là Merge Sort, ta thấy độ phức tạp thời gian được giảm đi đáng kể nhưng lại cần thêm hữu hạn không gian chứa.
        - Vậy, ta dùng Radix Sort tốt nhất khi số lượng phần tử lớn và dữ liệu tập trung, không có các giá trị cận trên quá lớn.
        - Thực hiện so sánh trên tập số nguyên, với cận trên của dữ liệu là 1000000, Radix Sort hoàn thành trong thời gian bằng một nửa Merge Sort với bộ dữ liệu từ 50000 phần tử trở lên.
        - Thực ra, Radix Sort thật sự phát huy hết ý nghĩa ở đây, ngoài một phần lợi thế của nó là sắp xếp với tốc độ cao được sử dụng.
        + Đối với việc xếp đối tượng AmountSold, các sản phẩm xuất hiện trước sẽ luôn được xếp trước và ít có cơ hội được đề cử hơn.
        + Thêm vào, với 2 đối tượng minh họa (A,2) và (B,3) với chỉ số thứ hai được dùng để sắp xếp, và sản phẩm B được đề xuất còn A thì không.
        + Nếu B không được mua thêm nhưng A chỉ được mua thêm một (2 + 1 = 3) thì B vẫn tiếp tục được đề tiếp tục được đề cử. Điều này đòi hỏi A phải được mua nhiều hơn nữa.
    */
    public static void radixSort(List<AmountSold> list, boolean desc) {
        int max = maxSold(list);

        for (int exp = 1; max >= exp; exp *= 10) { // k = log10(max)
            countingSort(list, exp, desc);
        }
    }

    // @author: KDMinh
    /* @description:
        - Đây là Counting Sort - thuật toán sắp xếp ổn định lồng trong thuật toán Radix Sort
        - Hiểu đơn giản, thuật toán này thực hiện trên tập dữ liệu nhỏ, tập trung, có cận trên không quá lớn.
        - VD: 0, 0, 1, 2, 3, 6, 7, 9, 3, 4, 5, 7 (nên dùng)
        - VD: 0, 1000, 2, 3 (không nên dùng do có 1000 quá lớn)
        - Thuật toán sắp xếp bằng cách đếm số lần xuất hiện của mỗi số, lưu vào 1 int array có tên countArray (1)
        + Dựa trên dữ liệu nguyên gốc từ đầu vào, nhờ có exp chỉ định, ta xác định được giá trị tại hàng cần tính (theo mong muốn ở Radix Sort).
        - Sau đó, cộng tích lũy từ trái sang phải của countArray (2.1 desc == true)
        + Hoặc cộng tích lũy từ phải sang trái của countArray (2.2 desc == false)
        - Dựa trên giá trị trong countArray hiện tại, với mỗi giá trị lúc đầu, vị trí lớn nhất chính bằng số trong countArray trừ 1. (3)
        + Nếu có các giá trị giống nhau, các giá trị đó sẽ nằm ở bên trái giá trị tương ứng đã điền.
        + Và khi duyệt từ phải qua, vị trí tương quan của các phần tử có cùng giá trị là không đổi, nên nó ổn định.
        + Chú ý, tại vị trí i trên countArray có giá trị bằng 0, khi đó không còn giá trị i trong danh sách cần duyệt.
        - Cập nhật lại các phần tử vào list lúc đầu. (4)


        - Với sự hỗ trợ chia nhỏ vấn đề của Radix Sort, cận trên trong dữ liệu đầu của Counting Sort vào luôn là 9 (tối đa) - trong hệ thập phân.
        - Độ phức tạp:
        + Thời gian: O(n)
        + Không gian: O(n + d) với d là độ dài countArray (d = const = 10)
    */
    private static void countingSort(List<AmountSold> list, int exp, boolean desc) {
        AmountSold[] outputArray = new AmountSold[list.size()];
        int[] countArray = new int[10];
        int quantity;

        for (AmountSold amountSold : list) { //(1)
            quantity = amountSold.getAmountSold();
            countArray[(quantity / exp) % 10]++;
        }

        if (desc) { //sắp xếp theo thứ tự giảm dần
            for (int i = countArray.length - 1; i > 0; i--) { //(2.1)
                countArray[i - 1] += countArray[i];
            }
        } else { //sắp xếp theo thứ tự tăng dần
            for (int i = 1; i < countArray.length; i++) { //(2.2)
                countArray[i] += countArray[i - 1];
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) { //(3)
            quantity = list.get(i).getAmountSold();
            outputArray[--countArray[(quantity / exp) % 10]] = list.get(i);
        }

        for (int i = 0; i < list.size(); i++) { //(4)
            list.set(i, outputArray[i]);
        }
    }

    private static int maxSold(List<AmountSold> list) {
        int maxSold = 0;

        for (AmountSold amountSold : list) {
            int quantity = amountSold.getAmountSold();
            if (maxSold < quantity) {
                maxSold = quantity;
            }
        }

        return maxSold;
    }
}
