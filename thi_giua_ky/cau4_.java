package thi_giua_ky;
import java.util.Scanner;
public class cau4_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a = sc.nextFloat();
        System.out.println("Nhập b: ");
        float b = sc.nextFloat();
        float denta = b*b;
        if(denta < 0)
            System.out.println("phuong trinh vo nghiem");
        else if(denta ==0)
            System.out.println("phuong trinh co nghiem kep" + (-b/(2*a)));
        else if(denta >0)
            System.out.println("pt co 2 nghiem");
        System.out.println("X1= " + (-b+Math.sqrt(denta))/(2*a));
        System.out.println("x1 " + (-b-Math.sqrt(denta))/(2*a));
    }
}
