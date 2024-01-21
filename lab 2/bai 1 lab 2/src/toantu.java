import java.util.Scanner;

/**
 * toantu
 */
public class toantu {

public static void main(String[] args) {
    Double a,b,tong,hieu,tich,thuong,chiadu;
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap a:");
     a=sc.nextDouble();
    System.out.println("nhap b:");
     b=sc.nextDouble();
    tong = a + b;
    System.out.println(" ket qua la " + tong);
    hieu = a - b;
    System.out.println(" ket qua la" + hieu);
    tich = a * b;
    System.out.println("ket qua la" + tich);
    thuong = a / b;
    System.out.println("ket qua la" + thuong);
    chiadu = a % b;
    System.out.println("ket qua la" + chiadu);
    if(a>b)
       System.out.println(a + "lon hon" + b);
    if(a<b)
       System.out.println(a + "nho hon" + b);
    if(a==b)
       System.out.println(a + " bang" + b);   
}
}