package Person;

import java.util.Scanner;
    public class Employee extends Person {
    public String Vitri;
    public double Luong = 30000;
    public String MaNV;
    Scanner sc = new Scanner(System.in);
    public Employee() 
    {
        MaNV = "";
        Vitri = "";
    }
    public void xuatvitri()
    {
        System.out.println("========" + Vitri + "========");
    }
    public void NhapDuLieu()
    {
        super.NhapDuLieu();
        System.out.print("ID nhan vien: ");
        MaNV = sc.nextLine();
    }
    public void XuatDuLieu()
    {
        super.XuatDuLieu();
        System.out.println("ID nhan vien: " + MaNV);
        System.out.println("Luong: " + Luong + "VND");
    }
    
}

