package chuong_6;
import java.util.Scanner;

public class baitap6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        int a = sc.nextInt();
        System.out.print("\nNhập b: ");
        int b = sc.nextInt();
        int result = UCLN(a, b);
        if (a < 0 || b < 0) {
            System.out.println("\na hoặc b không hợp lệ!!!");
        } else
            System.out.println("\nUCLN = " + result);
    }

    static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                return (UCLN(a-b,b));
            } else {
                return (UCLN(a, b-a));
            }
        }
        return a;
    }

}

