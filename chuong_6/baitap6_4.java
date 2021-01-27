package chuong_6;
import java.util.Scanner;
public class baitap6_4 {
    static void nhiPhan(int n){
        System.out.println(Integer.toBinaryString(n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n=sc.nextInt();
        if (n < 0) {
            System.out.println("n không hợp lệ !!!");
        } else {
            System.out.print("Đổi sang hệ nhị phân của " + n + " là: ");
            nhiPhan(n);
        }
    }
}
