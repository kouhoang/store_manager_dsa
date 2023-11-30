package code.storage;

import java.util.ArrayList;
import java.util.List;

//Design pattern: Singleton
public class Storage {
    private static Storage instance = null;

    //Sẽ có 2 thứ lưu chuỗi thông tin
    //1. Lưu đầu mã sản phẩm (3 chữ cái đầu của id) -> Hướng tiếp cận: ArrayList
    // + Mục đích: xác định nơi sản phẩm có đầu mã id tương ứng được thêm vào đúng StorageHeap
    //2. Lưu list các cây sản phẩm (StorageHeap)

//    private final ArrayList<> listOfProductName = new ArrayList<>;

    private Storage(){
    }

    public static Storage getInstance(){
        if(instance == null){
            instance = new Storage();
        }

        return instance;
    }

    private final List<StorageHeap> storage = new ArrayList<>();

    static {
        //Thực hiện thêm các nơi lưu cấu trúc dữ liệu
        //Giải thích: Ngay class Storage được chạy, hàm static sẽ chạy
    }

    public void add(String id/*, product*/){
        //Với mỗi kiểu sản phẩm, có đầu mã id xác định -> đối chiếu và tìm object StorageHeap lưu các sản phẩm (Product) mang đầu mã đó.

    }

    public boolean isContain(String id){
        //Need completed

        return false;
    }


}
