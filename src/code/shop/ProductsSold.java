package code.shop;

import code.tree.SimpleTreeMethod;

public class ProductsSold /*implements SimpleTreeMethod<String, >*/ {
    //Là các "kệ hàng" lưu các sản phẩm được bày bán và là sản phẩm có đầu vào nhập vào sớm nhất.
    //Lưu các sản phẩm - tất cả các loại.
    //Là một cây
    //Chỉ cần 1 -> Design pattern: Singleton.

    private static ProductsSold instance;
    private ProductsSold(){
    }
    public static ProductsSold getInstance(){
        if(instance == null){
            instance = new ProductsSold();
        }

        return instance;
    }

    //CTDL: BBST
    static class ProductNode{
        String id;
        //Product product
        ProductNode parent;
        ProductNode left;
        ProductNode right;

    }

    private ProductNode root = null;

    public ProductNode getRoot(){
        return root;
    }

}
