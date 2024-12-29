/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lthdt;

import java.time.LocalDate;

/**
 *
 * @author CAM HUYEN
 */


public class Demo {

    public static void main(String[] args) {

        BoKiemDinh bkd1 = new BoKiemDinh("BKD1", "MOET");
        

        TieuChuan tieuchuan1 = new TieuChuan("TieuChuan1", "Tieu chuan 1", "Noi dung tieu chuan 1");
        TieuChi tieuchi1 = new TieuChi("TieuChi1", "Tieu chi 1.1", "Noi dung tieu chi 1.1");
        TieuChi tieuchi2 = new TieuChi("TieuChi2", "Tieu chi 1.2", "Noi dung tieu chi 1.2");

        bkd1.themTieuChuan(tieuchuan1);
        tieuchuan1.themTieuChi(tieuchi1);
        tieuchuan1.themTieuChi(tieuchi2);

        TieuChuan tieuchuan2 = new TieuChuan("TieuChuan2", "Tieu chuan 2", "Noi dung tieu chuan 2");
        TieuChi tieuchi3 = new TieuChi("TieuChi3", "Tieu chi 2.1", "Noi dung tieu chi 2.1");
        TieuChi tieuchi4 = new TieuChi("TieuChi4", "Tieu chi 2.2", "Noi dung tieu chi 2.2");

        bkd1.themTieuChuan(tieuchuan2);
        tieuchuan2.themTieuChi(tieuchi3);
        tieuchuan2.themTieuChi(tieuchi4);
        
        PhongBan pb1 = new PhongBan("PB1", "Phong dam bao chat luong");
         PhongBan pb2 = new PhongBan("PB2", "Phong dam bao chat luong 2");
         PhongBan pb3 = new PhongBan("PB3", "Phong dam bao chat luong 3");
         PhongBan pb4 = new PhongBan("PB4", "Phong dam bao chat luong 4");

        MinhChung mc1 = new MinhChung("MC1", "Minh chung 1", "Noi ban hanh 1", LocalDate.parse("2022-01-01") , LocalDate.parse("2022-02-01"), LocalDate.parse("2023-06-01"),pb1);
        MinhChung mc2 = new MinhChung("MC2", "Minh chung 2", "Noi ban hanh 2", LocalDate.parse("2022-02-01"), LocalDate.parse("2022-02-02"), LocalDate.parse("2023-02-01"),pb2);
        MinhChung mc3 = new MinhChung("MC3", "Minh chung 3", "Noi ban hanh 3", LocalDate.parse("2022-03-01"), LocalDate.parse("2022-03-02"), LocalDate.parse("2023-05-01"),pb3);
        MinhChung mc4 = new MinhChung("MC4", "Minh chung 3", "Noi ban hanh 4", LocalDate.parse("2022-04-01"),  LocalDate.parse("2022-04-02"), LocalDate.parse("2024-03-04"),pb4);

        tieuchi1.themMinhChung(mc4);
        tieuchi1.themMinhChung(mc3);
        tieuchi2.themMinhChung(mc2);

        
        TruongPhong tp = new TruongPhong("TP1", "Nguyen Van A", "Truong phong");
        NhanVienGiangVien gv = new NhanVienGiangVien("GV1", "Tran B", "Giang vien");

        while (true) {
            System.out.println("====================MENU====================");
            System.out.println("1. Tao cau truc mot bo kiem dinh");
            System.out.println("2. Bien soan noi dung cac tieu chi");
            System.out.println("3. Them minh chung cho cac tieu chi");
            System.out.println("4. Xoa minh chung cho cac tieu chi");
            System.out.println("5. Cap nhat minh chung cho cac tieu chi");
            System.out.println("6. Truong phong dam bao chat luong cap quyen cho giang vien");
            System.out.println("7. Xem danh sach minh chung theo tung tieu chi");
            System.out.println("8. Sap xep danh sach minh chung theo ngay tao");
            System.out.println("9. Tim kiem minh chung theo ten");
            System.out.println("10. Tim kiem minh chung theo co quan ban hanh");
            System.out.println("11. Tim kiem minh chung theo ngay ban hanh");
            System.out.println("12. Thoat");

            System.out.print("Chon chuc nang: ");
            int choice = CauHinh.sc.nextInt();
            CauHinh.sc.nextLine();

            switch (choice) {
                case 1:
                    BoKiemDinh bkd2 = new BoKiemDinh();
                    bkd2.taoCauTrucBKD();
                    bkd2.hienThiThongTin();

                    break;
                case 2:
                    tieuchuan1.bienSoanNoiDungTieuChi();
                    tieuchuan2.bienSoanNoiDungTieuChi();
                    bkd1.hienThiThongTin();
                    break;
                case 3:

                    tieuchi1.themMinhChung(mc1);
                    tieuchi2.themMinhChung(mc2);

                    tieuchi1.show();
                    tieuchi2.show();
                    break;
                case 4:

                    tieuchi1.xoaMinhChung("MC3");
                    tieuchi1.show();
                    break;
                case 5:
                    tieuchi1.capNhatMinhChung();
                    tieuchi1.show();

                    break;
                case 6:
                     
                    pb1.capQuyenTP(tp);
                    tp.getDanhSachDuocCapQuyen().add(gv);
                    gv.hienThi();
                    tp.capQuyenChoGiangVien(gv);
                    break;
                    
                case 7:
                    tieuchi1.show();
                    tieuchi2.show();
                    break;
                case 8:
                    System.out.println("=============DANH SACH MINH CHUNG SAP XEP TANG THEO NGAY TAO ");
                     tieuchi1.sapXepMCTheoNgayTangDan();
                    break;
                case 9:
                    tieuchi1.timKiemTheoTen();
                    break;

                case 10:
                    tieuchi1.timKiemTheoCoQuan();
                    break;
                case 11:
                    tieuchi1.timKiemTheoNgayBanHanh();
                    break;
                
                case 12:
                    System.out.println("Ket thuc chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le!");
                    break;
            }

        }
    }
}
