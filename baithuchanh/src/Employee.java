import java.util.Scanner;

public class Employee {
    Scanner sc = new Scanner(System.in);
    public String IdNV ;
    public String hoTen;
    public String viTriNV;
    public int namLamviec;
    public int Luong = 1000;
    public void nhapThongtinNV()
    {
        System.out.println(" Nhap Thong Tin Nhan Vien :");
        System.out.println("Ma Nhan Vien :");
        IdNV = sc.nextLine();
        System.out.println("Ho Va Ten :");
        hoTen = sc.nextLine();
        System.out.println("Vi Tri Nhan Vien :");
        viTriNV = sc.nextLine();
        System.out.println("Nam Gan Bo Lam Viec :");
        namLamviec = sc.nextInt();
    }
public void tinhLuong(int namLamviec)
    {
        if(namLamviec<2)
            Luong +=2000;
        else if(namLamviec<5)
            Luong +=3000;
        else if(namLamviec<10)
            Luong +=5000;
        else 
            Luong +=10000;            
    }
    public void xuatThongTinNV()
    {
        System.out.println("Hien Thi Thong Tin Nhan Vien La :");
        System.out.println("Ma Nhan Vien:" + IdNV);
        System.out.println("Ho Va Ten Nhan Vien:");
        System.out.println("Vi Tri Nhan VIen:"+ viTriNV);
        System.out.println("Nam Gan Bo Lam Viec:"+ namLamviec);
        System.out.println("Luong Nhan Vien"+ Luong);
    }
}
;