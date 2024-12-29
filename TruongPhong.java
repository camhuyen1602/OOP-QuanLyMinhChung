/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lthdt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author CAM HUYEN
 */
public class TruongPhong extends Nguoi {
    private List<BoKiemDinh> dsBKD = new ArrayList<>();
    private List<NhanVienGiangVien> danhSachDuocCapQuyen = new ArrayList<>();

    public TruongPhong(String ma, String ten, String chucVu) {
        super(ma, ten, chucVu);
    }

    public void themBKD(BoKiemDinh... bkd) {
        this.getDsBKD().addAll(Arrays.asList(bkd));
    }

    public void capQuyenChoGiangVien(NhanVienGiangVien n) {
        System.out.println("Nhap quyen can cap: ");
        String quyen=CauHinh.sc.nextLine();
        if (getDanhSachDuocCapQuyen().contains(n)) {
            System.out.println("Da cap quyen " + quyen + " cho " + n.getTen());
        } else {
            System.out.println("Nguoi nay khong thuoc danh sach duoc cap quyen.");
        }
    }

    

    // Thêm một phương thức mới để hiển thị thông tin
    @Override
    public void hienThi() {
        System.out.println("Ma: " + getMa() + ", Ten: " + getTen() + ", Chuc vu: " + getChucVu());
    }

    /**
     * @return the dsBKD
     */
    public List<BoKiemDinh> getDsBKD() {
        return dsBKD;
    }

    /**
     * @param dsBKD the dsBKD to set
     */
    public void setDsBKD(List<BoKiemDinh> dsBKD) {
        this.dsBKD = dsBKD;
    }

    /**
     * @return the danhSachDuocCapQuyen
     */
    public List<NhanVienGiangVien> getDanhSachDuocCapQuyen() {
        return danhSachDuocCapQuyen;
    }

    /**
     * @param danhSachDuocCapQuyen the danhSachDuocCapQuyen to set
     */
    public void setDanhSachDuocCapQuyen(List<NhanVienGiangVien> danhSachDuocCapQuyen) {
        this.danhSachDuocCapQuyen = danhSachDuocCapQuyen;
    }
}