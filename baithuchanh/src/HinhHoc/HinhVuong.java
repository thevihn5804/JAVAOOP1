package HinhHoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
      public HinhVuong()
    {
        ten = "Hinh Vuong";
    }
    public void nhapCanh()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh: ");
        dai = rong = sc.nextFloat();
    }
}
