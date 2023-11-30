package code.shop;

public class Shop {
    //Chỉ cần 1 đối tượng Shop -> Design pattern: Singleton
    private static Shop instance = null;
    private Shop(){
    }
    public static Shop getInstance(){
        if(instance == null){
            instance = new Shop();
        }

        return instance;
    }

    //Mang thuộc tính cần phải có: ProductsSold và Statistics
    //Khi thực hiện việc tìm kiếm, bán sản phẩm mang mã id thì Products có chức năng tìm và loại bỏ ra khỏi CTDL.
    //Sau khi bán hàng, cập nhật doanh thu vào Statistics.

    //Class StorageOutput
    //Trong trường hợp, một sản phẩm được bày bán trên kệ lại không có trong ProductsSold, vậy hẳn có nhầm lẫn gì đó và
    // nhân viên cửa hàng thực hiện việc lấy sản phẩm từ kho ra kệ, rồi nếu cần sẽ xóa (nếu khách hàng mua)
    private final ProductsSold productsSold = ProductsSold.getInstance();

    public boolean isContain(String id){
        //Thực hiện isContain(..) trong productsSold

        return false;
    }

    public void remove(){



    }

    public void additionalInsert(String id){
        // Khi xảy ra trường hợp: nhân viên phát hiện hàng trên kệ chưa được cập nhật trên hệ thống -> thực hiện nhập thêm thủ công
        // Lấy sản phảm từ Storage hay cụ thể là thông qua StorageOutput.
    }
}
