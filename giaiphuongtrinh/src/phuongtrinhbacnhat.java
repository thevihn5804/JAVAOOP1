/**
 * phuongtrinhbacnhat
 */
import java.util.Scanner;
 public class phuongtrinhbacnhat {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.print("nhap a:");
      Double a=sc.nextDouble();
      System.out.print ("nhap b:");
      double b=sc.nextDouble();
      if( a==0) {
        if(b==0){
          System.out.println("phuong trinh co vo so nghiem.");
        }else{
          System.out.println("phuong trinh vo nghiem.");
        }
      }else{
        double x = -b / a;
        System.out.println("Nghiem cua phuong trinh la x ="+ x );
      }
      sc.close();
    }
}
