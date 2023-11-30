package code.storage;

import java.util.ArrayList;

//Design pattern: Singleton
public class Storage {
    private static Storage storage = null;

    //Sẽ có 2 thứ lưu chuỗi thông tin
    //1. Lưu đầu mã sản phẩm (3 chữ cái đầu của id) -> Hướng tiếp cận: Enum (?), ArrayList
    //2. Lưu list các cây sản phẩm (StorageBBST)

//    private final ArrayList<> listOfProductName = new ArrayList<>;

    private Storage(){
    }

    public static Storage getInstance(){
        if(storage == null){
            storage = new Storage();
        }

        return storage;
    }
}
