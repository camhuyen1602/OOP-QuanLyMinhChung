/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lthdt;

/**
 *
 * @author CAM HUYEN
 */


public class NhanVienGiangVien extends Nguoi {
    public NhanVienGiangVien(String ma, String ten, String chucVu) {
        super(ma, ten, chucVu);
    }
    @Override
    public void hienThi() {
        System.out.println("Ma: " + getMa() + ", Ten: " + getTen() + ", Chuc vu: " + getChucVu());
    }

}