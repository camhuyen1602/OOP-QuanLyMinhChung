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
public class QuanLyNguoi {
    private List<Nguoi> dsNguoi=new ArrayList<>();
    
   public void themNguoi(Nguoi nguoi) {
       this.dsNguoi.add(nguoi);
    }

    public void xoaNguoi(Nguoi nguoi) {
        this.dsNguoi.remove(nguoi);
    }

    /**
     * @return the dsNguoi
     */
    public List<Nguoi> getDsNguoi() {
        return dsNguoi;
    }

    /**
     * @param dsNguoi the dsNguoi to set
     */
    public void setDsNguoi(List<Nguoi> dsNguoi) {
        this.dsNguoi = dsNguoi;
    }


}
