package Slide80chuong3;

import java.util.Scanner;

public class Nhanvien {
    protected String ten;
    protected long luong;
    Scanner sc = new Scanner(System.in);
    public Nhanvien() {
        ten = "";
        luong = 0;
    }
    public Nhanvien(String ten) {
        this.ten = ten;
    }
    protected String loaiNhanVien() {
        return "";
    }
    public void xuatThongTin() {
        System.out.println("======================");
        System.out.println("Ten nhan vien: " + ten);
        System.out.println("Loai nhan vien: " + loaiNhanVien());
        System.out.println("Luong = " + luong + "VND");
    }
}
