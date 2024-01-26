import java.util.Scanner;

/**
 * phuongtrinhtinhdotuoi
 */
public class phuongtrinhtinhdotuoi {

    public static void main(String[] args) {
        int tuoi, namsinh ;
        String ten;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap ten");
        ten=sc.nextLine();
        System.out.println("nhap namsinh");
        namsinh=sc.nextInt();
        tuoi=2024 - namsinh;
        if(tuoi<16){
            System.out.println("ban"+ ten +"o do tuoi vi thanh nien");
        }else if(tuoi>=16 && tuoi< 18){
            System.out.println("ban"+ ten +"o do tuoi truong thanh");
        }else{
            System.out.println("ban"+ ten +"da gia");
        }
        sc.close();
    }
}