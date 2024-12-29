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
public class TieuChuan {
    private String maTChuan;
    private String tenTChuan;
  private String noiDung;
   private List<TieuChi> dsTieuChi = new ArrayList<>();

    public TieuChuan() {
    }

    public TieuChuan(String maTChuan, String tenTChuan, String noiDung) {
        this.maTChuan = maTChuan;
        this.tenTChuan = tenTChuan;
        this.noiDung = noiDung;
    }


  public void themTieuChi(TieuChi... tieuChi) {
      this.getDsTieuChi().addAll(Arrays.asList(tieuChi));

  }

  public void xoaTieuChi(String maTieuChi) {
    this.getDsTieuChi().removeIf(s -> s.getMaTChi().equals(maTieuChi));
  }

  public void nhap1TieuChuan() {
    CauHinh.sc.nextLine();
    System.out.println("Ma tieu chuan: ");
    this.maTChuan = CauHinh.sc.nextLine();
    System.out.println("Ten tieu chuan: ");
    this.tenTChuan = CauHinh.sc.nextLine();
    System.out.println("Noi dung tieu chuan: ");
    this.setNoiDung(CauHinh.sc.nextLine());
  }

  public void taoDanhSachTieuChi() {
    System.out.print("Nhap so luong tieu chi cho tieu chuan (tu 3 den 20): ");
    int soTieuChi = CauHinh.sc.nextInt();
    while (soTieuChi < 3 || soTieuChi > 20) {
      System.out.println("So luong tieu chi phai nam trong khoang tu 3 den 20. Vui long nhap lai!");
      System.out.print("Nhap so luong tieu chi cho tieu chuan (tu 3 den 20): ");
      soTieuChi = CauHinh.sc.nextInt();
    }

    for (int j = 0; j < soTieuChi; j++) {
      TieuChi tieuChi = new TieuChi();
      tieuChi.nhap1TieuChi();
      themTieuChi(tieuChi);
    }
  }
   public void bienSoanNoiDungTieuChi() {
  for (TieuChi tieuChi : getDsTieuChi()) {
     
    System.out.println(tieuChi.getTenTChi());
    
   System.out.println("Nhap noi dung cho tieu chi: ");
    String noiDungTieuChi = CauHinh.sc.nextLine();
    tieuChi.setNoiDung(noiDungTieuChi);
  }
}

   public void hienThiThongTin() {
    System.out.println("Thong tin Tieu Chuan:");
    System.out.println("Ma: " + this.getMaTChuan());
    System.out.println("Ten: " + this.getTenTChuan());
    System.out.println("Noi dung: " + this.getNoiDung());

    System.out.println("Danh sach Tieu Chi:");
    for (TieuChi tieuChi : getDsTieuChi()) {
      tieuChi.hienThiThongTin(); // Gọi phương thức hiển thị thông tin của TieuChi
    }
  }

    /**
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * @return the dsTieuChi
     */
    public List<TieuChi> getDsTieuChi() {
        return dsTieuChi;
    }

    /**
     * @param dsTieuChi the dsTieuChi to set
     */
    public void setDsTieuChi(List<TieuChi> dsTieuChi) {
        this.dsTieuChi = dsTieuChi;
    }

    /**
     * @return the maTChuan
     */
    public String getMaTChuan() {
        return maTChuan;
    }

    /**
     * @param maTChuan the maTChuan to set
     */
    public void setMaTChuan(String maTChuan) {
        this.maTChuan = maTChuan;
    }

    /**
     * @return the tenTChuan
     */
    public String getTenTChuan() {
        return tenTChuan;
    }

    /**
     * @param tenTChuan the tenTChuan to set
     */
    public void setTenTChuan(String tenTChuan) {
        this.tenTChuan = tenTChuan;
    }
}
