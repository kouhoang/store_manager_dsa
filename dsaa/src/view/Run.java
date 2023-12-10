/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatLightLaf;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Account;
import model.Product;

/**
 *
 * @author Ngoc
 */
public class Run {
    
    public static ArrayList<Account> AccountData = new ArrayList<>();
    public static ArrayList<Product> ProductData = new ArrayList<>();
    
    public static void ReadDataAccount() throws FileNotFoundException, IOException {
        String fileName = "F:\\DSA final\\dsaa\\src\\FileDataAccount.txt";//bạn hãy thay đổi đường dẫn tới file của bạn
		
        try(Stream<String> stream = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8)){//đưa về dạng chuẩn utf8
            stream.forEach(line ->{           
                int s1=0,s2=0,s3=0,dem=0;
                String fullName ="";
                String user ="";
                String password ="";
                String role ="";
                for (int i = 0; i < line.length(); i++) {
                    if(s1 ==0 && line.charAt(i)=='|') {
                        s1 = i;
                    } else if (s2 ==0 && line.charAt(i)=='|') {
                       s2 = i;
                    } else if (s3 ==0 && line.charAt(i)=='|') {
                        s3 =i;
                    }
                }
                for (int i = 0; i < s1; i++) {
                    fullName += line.charAt(i);
                }
                for (int i = s1+1; i < s2; i++) {
                    user += line.charAt(i);
                }
                for (int i = s2+1; i < s3; i++) {
                    password += line.charAt(i);
                }
                for (int i = s3+1; i < line.length(); i++) {
                    role += line.charAt(i);
                }
              //  System.out.println(fullName + "\n" + user +"\n" + password +"\n" + role);
              Account acc = new Account(fullName, user, password, role);
              AccountData.add(acc);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public static void ReadDataProduct() throws FileNotFoundException, IOException {
        String fileName = "F:\\DSA final\\dsaa\\src\\FileDataProduct.txt";//bạn hãy thay đổi đường dẫn tới file của bạn
	//String maMay, String tenMay, int soLuong, double gia, String tenCpu, String ram, String cardManHinh, String rom	
        try(Stream<String> stream = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8)){//đưa về dạng chuẩn utf8
            stream.forEach(line ->{           
                int s1=0,s2=0,s3=0,s4=0,s5=0,s6=0,s7=0,dem=0;
                String mamay ="";
                String tenmay ="";
                String soluong ="";
                String dongia ="";
                String boxuli ="";
                String ram ="";
                String card="";
                String bonho ="";
                for (int i = 0; i < line.length(); i++) {
                    if(s1 ==0 && line.charAt(i)=='|') {
                        s1 = i;
                    } else if (s2 ==0 && line.charAt(i)=='|') {
                       s2 = i;
                    } else if (s3 ==0 && line.charAt(i)=='|') {
                        s3 =i;
                    }else if (s4 ==0 && line.charAt(i)=='|') {
                       s4 = i;
                    } else if (s5 ==0 && line.charAt(i)=='|') {
                        s5 =i;
                    } else if (s6 ==0 && line.charAt(i)=='|') {
                        s6 =i;
                    }else if (s7 ==0 && line.charAt(i)=='|') {
                        s7 =i;
                    }
                }
                for (int i = 0; i < s1; i++) {
                    mamay += line.charAt(i);
                }
                for (int i = s1+1; i < s2; i++) {
                    tenmay += line.charAt(i);
                }
                for (int i = s2+1; i < s3; i++) {
                    soluong += line.charAt(i);
                }
                for (int i = s3+1; i < s4; i++) {
                    dongia += line.charAt(i);
                }
                for (int i = s4+1; i < s5; i++) {
                    boxuli += line.charAt(i);
                }
                for (int i = s5+1; i < s6; i++) {
                    ram += line.charAt(i);
                }
                for (int i = s6+1; i < s7; i++) {
                    card += line.charAt(i);
                }
                for (int i = s7+1; i < line.length(); i++) {
                    bonho += line.charAt(i);
                }
              //  System.out.println(fullName + "\n" + user +"\n" + password +"\n" + role);
              Product product = new Product(mamay, tenmay, Integer.parseInt(soluong), Double.parseDouble(dongia), boxuli, ram, card, bonho);
              ProductData.add(product);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public static void WriteDataProduct() throws FileNotFoundException, IOException {
         
	 try {
            FileWriter fw = new FileWriter("F:\\DSA final\\dsaa\\src\\FileDataProduct.txt");
            fw.write("");
             for (Product product : ProductData) {
                 fw.write(product.getMaMay()+"|"+product.getTenMay()+"|"+product.getSoLuong()+"|"+product.getGia()+"|"+product.getTenCpu()+"|"+product.getRam()+"|"+product.getCardManHinh()+"|"+product.getRom()+"\n");
             }
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
     }
      public static void WriteDataAccount() throws FileNotFoundException, IOException {
         
	 try {
            FileWriter fw = new FileWriter("F:\\DSA final\\dsaa\\src\\FileDataAccount.txt");
            fw.write("");
             for (Account acc : AccountData) {
                 fw.write(acc.getFullName()+"|"+acc.getUser()+"|"+acc.getPassword()+"|"+acc.getRole()+"\n");
             }
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
     }
     
    
    public static void main(String[] args) throws IOException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel( new FlatLightLaf());
        ReadDataAccount();
        ReadDataProduct();
        Login login = new Login();
        login.setVisible(true);
    }
}
