package Slide3;

import java.util.ArrayList;
import java.util.Scanner;

public class testStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arrayListStudent = new ArrayList<>();
        System.out.println("Nhap so Phan tu");
        int n = sc.nextInt();
        Student.Add(arrayListStudent,n);
        System.out.println("Danh Sach Sinh Vien:");
        Student.Display(arrayListStudent);

        Student.Update(arrayListStudent);
        System.out.println("Danh Sach Sinh Vien Sau Khi Thay Doi");
        Student.Display(arrayListStudent);

        Student.Delete(arrayListStudent); 
        System.out.println("Danh Sach Sinh Vien Sau Khi Xoa"); 
        Student.Display(arrayListStudent);
    }
    
}
