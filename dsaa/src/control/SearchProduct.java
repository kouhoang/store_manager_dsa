package control;


import java.util.ArrayList;
import model.Product;
import view.Run;

/**
 *
 * @author sinh
 */
public class SearchProduct {

    public static SearchProduct getInstance() {
        return new SearchProduct();
    }

    public ArrayList<Product> searchTatCa(String text) {
        ArrayList<Product> result = new ArrayList<>();
        ArrayList<Product> armt = Run.ProductData;
        for (var mt : armt) {
            
                if (mt.getMaMay().toLowerCase().contains(text.toLowerCase()) || mt.getTenMay().toLowerCase().contains(text.toLowerCase())
                        || mt.getTenCpu().toLowerCase().contains(text.toLowerCase())
                        || mt.getCardManHinh().toLowerCase().contains(text.toLowerCase())
                        ) {
                    result.add(mt);
                }
            
        }
        return result;
    }

    public ArrayList<Product> searchMaMay(String text) {
         ArrayList<Product> result = new ArrayList<>();
        ArrayList<Product> armt = Run.ProductData;
        for (var mt : armt) {
            
                if (mt.getMaMay().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            
        }
        return result;
    }

    public ArrayList<Product> searchTenMay(String text) {
         ArrayList<Product> result = new ArrayList<>();
         ArrayList<Product> armt = Run.ProductData;
        for (var mt : armt) {
           
                if (mt.getTenMay().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            
        }
        return result;
    }

    public ArrayList<Product> searchSoLuong(String text) {
       ArrayList<Product> result = new ArrayList<>();
        ArrayList<Product> armt = Run.ProductData;
        for (var mt : armt) {
           
                if (text.length() != 0) {
                    if (mt.getSoLuong() > Integer.parseInt(text)) {
                        result.add(mt);
                    }
                } else {
                    result.add(mt);
                }
            
        }
        return result;
    }

    public ArrayList<Product> searchDonGia(String text) {
       ArrayList<Product> result = new ArrayList<>();
        ArrayList<Product> armt = Run.ProductData;
        for (var mt : armt) {
           

                if (text.length() != 0) {
                    if (mt.getGia() > Integer.parseInt(text)) {
                        result.add(mt);
                    }
                }
                else {
                    result.add(mt);
                }
             
        }
        return result;
    }

    public ArrayList<Product> searchRam(String text) {
      ArrayList<Product> result = new ArrayList<>();
        ArrayList<Product> armt = Run.ProductData;
        for (var mt : armt) {
            if (mt.getRam().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<Product> searchCpu(String text) {
       ArrayList<Product> result = new ArrayList<>();
        ArrayList<Product> armt = Run.ProductData;
        for (var mt : armt) {
            if (mt.getTenCpu().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<Product> searchDungLuong(String text) {
         ArrayList<Product> result = new ArrayList<>();
        ArrayList<Product> armt = Run.ProductData;
        for (var mt : armt) {
            if (mt.getRom().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<Product> searchCard(String text) {
        ArrayList<Product> result = new ArrayList<>();
        ArrayList<Product> armt = Run.ProductData;
        for (var mt : armt) {
            if (mt.getCardManHinh().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }


  

   

    public Product searchId(String text) {
       Product result = new Product();
       
        ArrayList<Product> armt = Run.ProductData;
        for (var mt : armt) {
            if (mt.getMaMay().toLowerCase().contains(text.toLowerCase())) {
                return mt;
            }
        }
        return null;
    }
}
