package ViDu_Chuong_3;
import java.util.Scanner;
public class baitap9 {
    public static float tinhGiaithua(int n) {
        int giai_thua = 1;
        int bf = 0;
        float s = 1;
        for (int i = 2; i <= n; i++) {
            bf += giai_thua;
            giai_thua *= i;
            int a = giai_thua + bf;
            s = s = (float) 1 / a;
        }
        return s;
    }


    public static void main(String[] args) {
    while(true) {
        System.out.println("Nhap n: ");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Kêt qua " + tinhGiaithua(n));
    }
    }
}
