package code.shop;

public class Statistics {
    //Thống kê số liệu thu thập được từ sản phẩm bán.
    //Chỉ cần 1 hàm để lưu xuyên suốt quá trình. -> Design pattern: Singleton
    private static Statistics instance = null;
    private Statistics(){
    }

    public static Statistics getInstance(){
        if(instance == null){
            instance = new Statistics();
        }

        return instance;
    }

    public void update(){

    }
}
