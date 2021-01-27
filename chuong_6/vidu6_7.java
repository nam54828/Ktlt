package chuong_6;
// xac dinh do dai cua chuoi ky tu
import java.util.Scanner;
public class vidu6_7 {
    public static void main(String[] args) {
        String chuoi;
        int doDai;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi bat ky tu ban phim: ");
        chuoi = sc.nextLine();
        doDai = chuoi.length();
        System.out.println("Chuoi "+ chuoi + " co do dai " + doDai);
    }
}
