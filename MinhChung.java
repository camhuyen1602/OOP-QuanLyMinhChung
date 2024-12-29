/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lthdt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author CAM HUYEN
 */
public class MinhChung {
private String maMChung;
private String tenMChung;
    private String noiBanHanh;
    private LocalDate ngayBanHanh;
    private List<PhongBan> dspb=new ArrayList<>();
    private LocalDate ngayCCMC;
    private LocalDate ngayTao;

    public MinhChung(String maMChung, String tenMChung, String noiBanHanh, LocalDate ngayBanHanh, LocalDate ngayCCMC, LocalDate ngayTao,PhongBan...pb) {
        this.maMChung = maMChung;
        this.tenMChung = tenMChung;
        this.noiBanHanh = noiBanHanh;
        this.ngayBanHanh = ngayBanHanh;
        this.ngayCCMC = ngayCCMC;
        this.ngayTao = ngayTao;
        this.dspb=Arrays.asList(pb);
    }
    
    public void nhap1MinhChung(PhongBan phongBan) {
    System.out.print("Ma minh chung: ");
    this.maMChung = CauHinh.sc.nextLine();
    System.out.print("Ten minh chung: ");
    this.tenMChung = CauHinh.sc.nextLine();
    System.out.print("Noi ban hanh: ");
    this.noiBanHanh = CauHinh.sc.nextLine();

    System.out.print("Ngay ban hanh (yyyy-MM-dd): ");
    this.ngayBanHanh = LocalDate.parse(CauHinh.sc.nextLine());

    // Set the provided PhongBan
    this.dspb = Arrays.asList(phongBan);

    System.out.print("Ngay CCMC (yyyy-MM-dd): ");
    this.ngayCCMC = LocalDate.parse(CauHinh.sc.nextLine());

    System.out.print("Ngay tao (yyyy-MM-dd): ");
    this.ngayTao = LocalDate.parse(CauHinh.sc.nextLine());
}

    public void suaMinhChung() {
        System.out.println("Nhap ma minh chung: ");
        String s1 = CauHinh.sc.nextLine();
        this.setMaMChung(s1);
    }
public void hienThiThongTin() {
        System.out.println("Thong tin Minh Chung:");
        System.out.println("Ma: " + this.getMaMChung());
        System.out.println("Ten: " + this.getTenMChung());
        System.out.println("Noi ban hanh: " + this.noiBanHanh);
        System.out.println("Ngay ban hanh: " + this.ngayBanHanh);
       
        System.out.println("Ngay CCMC: " + this.ngayCCMC);
        System.out.println("Ngay tao: " + this.ngayTao);
        if (!this.getDspb().isEmpty()) {
        System.out.println(" Phong Ban cung cap:");
        for (PhongBan pb : this.getDspb()) {
            pb.hienThiThongTin();
        }
        }
        else {
        System.out.println("Khong co Phong Ban duoc liet ke.");
    }
    }
    /**
     * @return the noiBanHanh
     */
    public String getNoiBanHanh() {
        return noiBanHanh;
    }

    /**
     * @param noiBanHanh the noiBanHanh to set
     */
    public void setNoiBanHanh(String noiBanHanh) {
        this.noiBanHanh = noiBanHanh;
    }

    /**
     * @return the ngayBanHanh
     */
    public LocalDate getNgayBanHanh() {
        return ngayBanHanh;
    }

    /**
     * @param ngayBanHanh the ngayBanHanh to set
     */
    public void setNgayBanHanh(LocalDate ngayBanHanh) {
        this.ngayBanHanh = ngayBanHanh;
    }

    

    /**
     * @return the ngayCCMC
     */
    public LocalDate getNgayCCMC() {
        return ngayCCMC;
    }

    /**
     * @param ngayCCMC the ngayCCMC to set
     */
    public void setNgayCCMC(LocalDate ngayCCMC) {
        this.ngayCCMC = ngayCCMC;
    }

    /**
     * @return the ngayTao
     */
    public LocalDate getNgayTao() {
        return ngayTao;
    }

    /**
     * @param ngayTao the ngayTao to set
     */
    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    /**
     * @return the maMChung
     */
    public String getMaMChung() {
        return maMChung;
    }

    /**
     * @param maMChung the maMChung to set
     */
    public void setMaMChung(String maMChung) {
        this.maMChung = maMChung;
    }

    /**
     * @return the tenMChung
     */
    public String getTenMChung() {
        return tenMChung;
    }

    /**
     * @param tenMChung the tenMChung to set
     */
    public void setTenMChung(String tenMChung) {
        this.tenMChung = tenMChung;
    }

    /**
     * @return the dspb
     */
    public List<PhongBan> getDspb() {
        return dspb;
    }

    /**
     * @param dspb the dspb to set
     */
    public void setDspb(List<PhongBan> dspb) {
        this.dspb = dspb;
    }
}
