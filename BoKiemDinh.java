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
public class BoKiemDinh {
    private String maBKD;
    private String tenBKD;
   private List<TieuChuan> dsTChuan = new ArrayList<>();
    

    public BoKiemDinh(String maBKD, String tenBKD) {
        this.maBKD = maBKD;
        this.tenBKD = tenBKD;
    }

  
  public BoKiemDinh() {
  }
   
  public void themTieuChuan(TieuChuan... tieuChuan) {
    this.dsTChuan.addAll(Arrays.asList(tieuChuan));

  }

  public void xoaTieuChuan(String maTieuChuan) {
    this.getDsTChuan().removeIf(s -> s.getMaTChuan().equals(maTieuChuan));
  }

  public TieuChuan timKiem(String maTieuChuan) {
    return this.getDsTChuan().stream()
        .filter(s -> s.getMaTChuan().equals(maTieuChuan))
        .findFirst()
        .orElse(null);
  }
  
  public void taoCauTrucBKD() {
    System.out.println("Nhap ten BKD: ");
    this.tenBKD=CauHinh.sc.nextLine();
     System.out.println("Nhap ma BKD: ");
    this.maBKD=CauHinh.sc.nextLine();
    System.out.print("Nhap so luong tieu chuan (tu 1 den 5): ");
    int soTieuChuan = CauHinh.sc.nextInt();
    while (soTieuChuan < 1 || soTieuChuan > 5) {
      System.out.println("So luong tieu chuan phai nam trong khoang tu 1 den 5. Vui long nhap lai!");
      System.out.print("Nhap so luong tieu chuan (tu 1 den 5): ");
      soTieuChuan = CauHinh.sc.nextInt();
    }

    for (int i = 0; i < soTieuChuan; i++) {
      TieuChuan tieuChuan = new TieuChuan();
      tieuChuan.nhap1TieuChuan();
      themTieuChuan(tieuChuan);

      tieuChuan.taoDanhSachTieuChi();
    }
  }
 public void hienThiThongTin() {
    System.out.println("Thong tin Bo Kiem Dinh:");
    System.out.println("Ma: " + this.getMaBKD());
    System.out.println("Ten: " + this.getTenBKD());

    System.out.println("Danh sach Tieu Chuan:");
    for (TieuChuan tieuChuan : dsTChuan) {
      tieuChuan.hienThiThongTin(); // Gọi phương thức hiển thị thông tin của TieuChuan
    }
  }
  public List<TieuChuan> getDsTChuan() {
    return dsTChuan;
  }

  public void setDsTChuan(List<TieuChuan> dsTChuan) {
    this.dsTChuan = dsTChuan;
  }

    /**
     * @return the maBKD
     */
    public String getMaBKD() {
        return maBKD;
    }

    /**
     * @param maBKD the maBKD to set
     */
    public void setMaBKD(String maBKD) {
        this.maBKD = maBKD;
    }

    /**
     * @return the tenBKD
     */
    public String getTenBKD() {
        return tenBKD;
    }

    /**
     * @param tenBKD the tenBKD to set
     */
    public void setTenBKD(String tenBKD) {
        this.tenBKD = tenBKD;
    }
}