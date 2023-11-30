package code.storage;

public class StorageHeap {
    //StorageHeap sẽ không mang design pattern Singleton vì nó phụ thuộc vào mã sản phẩm (id)
    //Storage mang key là mã sản phẩm (id), lưu giá trị sản phẩm

    //Cài đặt: cấu trúc mảng.
    protected static class StorageHeapEntry {
        protected String id; //key
//        protected product

        public String getId(){
            return id;
        }

//        public getValue()
    }

    private StorageHeapEntry[] heapStorage = heapStorage = new StorageHeapEntry[1000];
    private int size = 0;

    public StorageHeap() {
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insert(StorageHeapEntry entry){

    }

    public void insert(String id /*, product*/){

    }

    public StorageHeapEntry getEarliestInputDate(){
        //Đây là hàm min()

        return null;
    }

    public StorageHeapEntry removeEarliestInputDate(){
        //Đây là hàm removeMin()
        //Đầu ra của hàm chính là sản phẩm có ngày nhập kho sớm nhất, và là đầu vào cho class ProductsSold

        return null;
    }

    private void upHeap(){

    }

    private void downHeap(){

    }

    private void swap(int ancestorIdx, int descendantIdx){
        //ancestorIdx là index của entry gần với root hơn
        //descendantIdx là index của entry xa root hơn
        //Ý nghĩa của cả hai là như nhau


    }

    private void enlarge(){

    }
}
