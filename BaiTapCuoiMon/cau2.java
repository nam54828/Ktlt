package BaiTapCuoiMon;
import java.util.Scanner;
public class cau2 {
    public static long tinhGiaithua(int n) {
        if (n > 0) {
            return n * tinhGiaithua(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập N: ");
        int n = sc.nextInt();
        System.out.println("Giai thừa của " + n + ": " + tinhGiaithua(n));
    }
}
