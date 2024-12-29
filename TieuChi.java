/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lthdt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author CAM HUYEN
 */
public class TieuChi {

    private String maTChi;
    private String tenTChi;
    private String noiDung;
    private List<MinhChung> dsMinhChung = new ArrayList<>();

    public TieuChi(String maTChi, String tenTChi, String noiDung) {
        this.maTChi = maTChi;
        this.tenTChi = tenTChi;
        this.noiDung = noiDung;
    }

    public TieuChi() {
    }

    public void themMinhChung(MinhChung... minhChung) {
        this.dsMinhChung.addAll(Arrays.asList(minhChung));

    }

    public void xoaMinhChung(String maMinhChung) {
        this.getDsMinhChung().removeIf(s -> s.getMaMChung().equals(maMinhChung));
    }

    public List<MinhChung> timKiemTheoTen() {
        System.out.println("Nhap ten minh chung can tim kiem");
        String kw = CauHinh.sc.nextLine().toLowerCase();

        List<MinhChung> dsMCTheoTen = this.getDsMinhChung().stream()
                .filter(s -> s.getTenMChung().toLowerCase().contains(kw))
                .collect(Collectors.toList());

        if (dsMCTheoTen.isEmpty()) {
            System.out.println("Khong tim thay minh chung nao!");
        } else {
            System.out.println("Minh chung tim thay:");
            for (MinhChung mc : dsMCTheoTen) {
                mc.hienThiThongTin();
            }
        }

        return dsMCTheoTen;
    }

    public List<MinhChung> timKiemTheoCoQuan() {
        System.out.println("Nhap co quan ban hanh minh chung can tim kiem");
        String kw = CauHinh.sc.nextLine().toLowerCase();

        List<MinhChung> dsMCTheoCoQuan = this.getDsMinhChung().stream()
                .filter(s -> s.getNoiBanHanh().toLowerCase().contains(kw))
                .collect(Collectors.toList());

        if (dsMCTheoCoQuan.isEmpty()) {
            System.out.println("Khong tim thay minh chung nao!");
        } else {
            System.out.println("Minh chung tim thay:");
            for (MinhChung mc : dsMCTheoCoQuan) {
                mc.hienThiThongTin();
            }
        }

        return dsMCTheoCoQuan;
    }

    public List<MinhChung> timKiemTheoNgayBanHanh() {
        System.out.println("Nhap ngay ban hanh minh chung can tim kiem (yyyy-MM-dd):");
        String ngayBanHanhStr = CauHinh.sc.nextLine();

        // Chuyển đổi ngày từ chuỗi sang đối tượng LocalDate
        LocalDate ngayBanHanh = LocalDate.parse(ngayBanHanhStr);

        List<MinhChung> dsMCTheoNgayBanHanh = this.getDsMinhChung().stream()
                .filter(s -> s.getNgayBanHanh().equals(ngayBanHanh))
                .collect(Collectors.toList());

        if (dsMCTheoNgayBanHanh.isEmpty()) {
            System.out.println("Khong tim thay minh chung nao!");
        } else {
            System.out.println("Minh chung tim thay:");
            for (MinhChung mc : dsMCTheoNgayBanHanh) {
                mc.hienThiThongTin();
            }
        }

        return dsMCTheoNgayBanHanh;
    }

    public void hienThi() {
        this.dsMinhChung.forEach(s -> s.hienThiThongTin());
    }

    public void nhap1TieuChi() {
        CauHinh.sc.nextLine();
        System.out.println("Ma tieu chi: ");
        this.maTChi = CauHinh.sc.nextLine();
        System.out.println("Ten tieu chi: ");
        this.tenTChi = CauHinh.sc.nextLine();
        System.out.println("Noi dung tieu chi: ");
        this.setNoiDung(CauHinh.sc.nextLine());
    }

    public void capNhatMinhChung() {
        String maMChung;
        System.out.println("Nhap ma minh chung muon sua !!!");
        maMChung = CauHinh.sc.nextLine();
        boolean kt = false;

        for (MinhChung mc : dsMinhChung) {
            if (mc.getMaMChung().equals(maMChung)) {
                mc.suaMinhChung();
                kt = true;
                System.out.println("Cap nhat thanh cong! ");
            }
        }

        if (!kt) {
            System.out.println("KHONG TIM THAY! ");
        }
    }

    public List<MinhChung> sapXepMCTheoNgayTangDan() {
        List<MinhChung> danhSachSapXepTheoNgay = this.dsMinhChung.stream()
                .sorted(Comparator.comparing(MinhChung::getNgayTao))
                .collect(Collectors.toList());

        for (MinhChung mc : danhSachSapXepTheoNgay) {
            mc.hienThiThongTin();
        }

        return danhSachSapXepTheoNgay;
    }

    public List<MinhChung> sapXepMCTheoNgayGiamDan() {
        List<MinhChung> danhSachSapXepTheoNgay = this.dsMinhChung.stream()
                .sorted(Comparator.comparing(MinhChung::getNgayTao).reversed())
                .collect(Collectors.toList());

        for (MinhChung mc : danhSachSapXepTheoNgay) {
            mc.hienThiThongTin();
        }

        return danhSachSapXepTheoNgay;
    }

    public void hienThiThongTin() {
        System.out.println("Thong tin Tieu Chi:");
        System.out.println("Ma: " + this.getMaTChi());
        System.out.println("Ten: " + this.getTenTChi());
        System.out.println("Noi dung: " + this.getNoiDung());
    }

    public void show() {
        System.out.println("Thong tin Tieu Chi:");
        System.out.println("Ma: " + this.getMaTChi());
        System.out.println("Ten: " + this.getTenTChi());
        System.out.println("Noi dung: " + this.getNoiDung());

        System.out.println("Danh sach Minh Chung:");
        for (MinhChung minhChung : dsMinhChung) {
            minhChung.hienThiThongTin(); // Now calls the implemented method
        }
    }

    public List<MinhChung> getDsMinhChung() {
        return dsMinhChung;
    }

    public void setDsMinhChung(List<MinhChung> dsMinhChung) {
        this.dsMinhChung = dsMinhChung;
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
     * @return the maTChi
     */
    public String getMaTChi() {
        return maTChi;
    }

    /**
     * @param maTChi the maTChi to set
     */
    public void setMaTChi(String maTChi) {
        this.maTChi = maTChi;
    }

    /**
     * @return the tenTChi
     */
    public String getTenTChi() {
        return tenTChi;
    }

    /**
     * @param tenTChi the tenTChi to set
     */
    public void setTenTChi(String tenTChi) {
        this.tenTChi = tenTChi;
    }
}
