package Person;

import java.util.Scanner;

public class Person {
    public String HoTen;
    public int Tuoi;
    public String DiaChi;
    public int SoDienThoai;
    Scanner sc = new Scanner(System.in);
    public Person()
    {
        HoTen = "";
        Tuoi = 0;
        DiaChi = "";
        SoDienThoai = 0;
    }
    public void NhapDuLieu()
    {
        System.out.print("Ho Ten = ");
        HoTen = sc.nextLine();
        System.out.print("Tuoi = ");
        Tuoi = sc.nextInt();
        System.out.print("Dia Chi = ");
        DiaChi = sc.next();
        System.out.print("So Dien Thoai = ");
        SoDienThoai = sc.nextInt();
    }
    public void XuatDuLieu()
    {
        System.out.println("HoTen: " + HoTen );
        System.out.println("Tuoi: " + Tuoi);
        System.out.println("DiaChi: " + DiaChi);
        System.out.println("SoDienThoai: " + SoDienThoai);
}
}
