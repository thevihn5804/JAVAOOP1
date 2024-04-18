import java.util.Scanner;

/**
 * Kiemtrachanle
 */
public class Kiemtrachanle {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap vao mot so:");
    int so = sc.nextInt();
    if (so % 2 ==0) {
        System.out.print("la so chan");
    }else {
        System.out.print("la so le");
    }
}
}