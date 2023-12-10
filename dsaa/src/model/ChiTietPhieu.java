/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class ChiTietPhieu {

  
    private String maMay;
    private int soLuong;
    private double donGia;

    public ChiTietPhieu() {
    }

    public ChiTietPhieu(String maMay, int soLuong, double donGia) {
 
        this.maMay = maMay;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }




    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChiTietPhieu other = (ChiTietPhieu) obj;
        if (this.soLuong != other.soLuong) {
            return false;
        }
        if (Double.doubleToLongBits(this.donGia) != Double.doubleToLongBits(other.donGia)) {
            return false;
        }
   
        
        return Objects.equals(this.maMay, other.maMay);
    }

    @Override
    public String toString() {
        return "ChiTietPhieu{" + "maPhieu=" + ", maMay=" + maMay + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }

    
}
