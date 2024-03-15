import java.util.Scanner;

import javax.net.ssl.SNIHostName;

/**
 * Student
 */
public class Student {
        Scanner sc = new Scanner(System.in);
        String hoTen,diachi;
        int namsinh;
        double diemToan,diemVan,diemAnh,DTB;
        public void nhapThongtin()
        {
            System.out.println("Nhap Thong Tin Hoc Sinh");
            System.out.println("Ho Va Ten");
            hoTen= sc.nextLine();
            System.out.println("Dia Chi");
            diachi= sc.nextLine();
            System.out.println("Diem Toan");
            diemToan = sc.nextDouble();
            System.out.println("diemVan");
            diemVan = sc.nextDouble();
            System.out.println("diemAnh");
            diemAnh = sc.nextDouble();

        }
        public void tinhDiemTrungBinh()
        {
            DTB =(diemToan+diemVan+diemAnh)/ 3;
        }
        public void xuatThongTin()
        {
            System.out.println("Thong Tin Hoc Sinh La :");
            System.out.println("Ho Va Ten" + hoTen);
            System.out.println("Dia Chi" + diachi );
            System.out.println("Nam Sinh" + namsinh);
            System.out.println("Diem Trung Binh" + DTB);
        }
        }
