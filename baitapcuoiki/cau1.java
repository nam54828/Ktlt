package baitapcuoiki;
// Viết chương trình giải phương trình bậc 2: ax2 + bx + c = 0.
import java.util.Scanner;
public class cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        float a = sc.nextFloat();
        System.out.println("Nhap b: ");
        float b = sc.nextFloat();
        System.out.println("Nhap c: ");
        float c = sc.nextFloat();
        float delta= b*b - 4*a*c;
        if(delta < 0 )
            System.out.println("Phuong trinh vo nghiem");
        else if(delta==0)
            System.out.println("Phuong trinh co nghiem kep: " + (-b/(2*a)));
        else{
            System.out.println("Phuong trinh co 2 nghiem: ");
            System.out.println(" X1= " + (-b+Math.sqrt(delta))/(2*a));
            System.out.println("X2= " + (-b-Math.sqrt(delta))/(2*a));
        }

    }
}
