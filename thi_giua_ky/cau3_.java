package thi_giua_ky;
import java.util.Scanner;
public class cau3_ {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        float a = sc.nextFloat();
        System.out.print("Nhap b: ");
        float b = sc.nextFloat();
        if((a == 0) && (b == 0)){
            System.out.println("Phuong trinh co vo so nghiem: ");
        } else if ((a != 0)){
            System.out.println("Nghiem cua phuong trinh la X = " + (-b/a));
        } else if ((a == 0) && (b != 0)){
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
