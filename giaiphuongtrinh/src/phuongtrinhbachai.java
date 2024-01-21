import java.util.Scanner;

public class phuongtrinhbachai {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print ("nhap a:");
        Double a = sc.nextDouble();
        System.out.print ("nhap b:");
        Double b = sc.nextDouble();
        System.out.print ("nhap c:");
        Double c = sc.nextDouble();
        double delta = b * b - 4 * a * c;
        if (delta>0){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet:");
            System.out.println("x1 =" + x1);
            System.out.println("x2 =" + x2);
        } else if (delta ==0){
            double x = -b / (2 * a);
            System.out.println ("Phuong trinh co nghiem kep:");
            System.out.println ("x =" + x);
        }else{
            System.out.println("Phuong trinh vo nghiem");
        }
        sc.close();
    }
}
