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

    //Mang 2 thuộc tính cần phải có: ProductsSold và StorageOutput
    //Khi thực hiện việc tìm kiếm, bán sản phẩm mang mã id thì Products có chức năng tìm và loại bỏ ra khỏi CTDL.
    //Trong trường hợp, một sản phẩm được bày bán trên kệ lại không có trong ProductsSold, vậy hẳn có nhầm lẫn gì đó và
    // nhân viên cửa hàng thực hiện việc lấy sản phẩm từ kho ra kệ, rồi nếu cần sẽ xóa (nếu khách hàng mua)
}
