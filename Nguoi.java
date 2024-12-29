/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lthdt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CAM HUYEN
 */
public abstract class Nguoi {

    protected String ma;
    protected String ten;
    protected String chucVu;
    
    public Nguoi(String ma, String ten, String chucVu) {
        this.ma = ma;
        this.ten = ten;
        this.chucVu = chucVu;
    }

    public abstract void hienThi();
    
    /**
     * @return the ma
     */
    public String getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(String ma) {
        this.ma = ma;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the chucVu
     */
    public String getChucVu() {
        return chucVu;
    }

    /**
     * @param chucVu the chucVu to set
     */
    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

}



