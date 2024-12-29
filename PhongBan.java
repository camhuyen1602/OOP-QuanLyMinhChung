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
public class PhongBan {
    private String maPBan;
    private String tenPBan;
   private List<TruongPhong> dsTpcoQuyen = new ArrayList<>();

    public PhongBan(String maPBan, String tenPBan) {
        this.maPBan = maPBan;
        this.tenPBan = tenPBan;
    }
    public void nhap1PhongBan(){
        System.out.println("Nhap ma phong ban: ");
        this.maPBan=CauHinh.sc.nextLine();
        System.out.println("Nhap ten phong ban: ");
        this.tenPBan=CauHinh.sc.nextLine();
    }
   
    public void capQuyenTP(TruongPhong tp){
        this.getDsTpcoQuyen().add(tp);
    }
    
    public void hienThiDanhSachTPCoQuyen() {
        System.out.println("Danh sach Truong Phong co quyen:");
        for (TruongPhong tp : getDsTpcoQuyen()) {
            tp.hienThi();
        }
    }
    public void hienThiThongTin() {
        System.out.println("Ma: " + getMaPBan() + ", Ten: " + getTenPBan());
    }

    /**
     * @return the maPBan
     */
    public String getMaPBan() {
        return maPBan;
    }

    /**
     * @param maPBan the maPBan to set
     */
    public void setMaPBan(String maPBan) {
        this.maPBan = maPBan;
    }

    /**
     * @return the tenPBan
     */
    public String getTenPBan() {
        return tenPBan;
    }

    /**
     * @param tenPBan the tenPBan to set
     */
    public void setTenPBan(String tenPBan) {
        this.tenPBan = tenPBan;
    }

    /**
     * @return the dsTpcoQuyen
     */
    public List<TruongPhong> getDsTpcoQuyen() {
        return dsTpcoQuyen;
    }

    /**
     * @param dsTpcoQuyen the dsTpcoQuyen to set
     */
    public void setDsTpcoQuyen(List<TruongPhong> dsTpcoQuyen) {
        this.dsTpcoQuyen = dsTpcoQuyen;
    }
}


