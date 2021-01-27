package chuong_6;
import java.util.Scanner;
public class baitap6_3 {
    static float P (int n){
        if(n==1){
            return 1;
        }else{
            return((float)1/n+P(n-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số N: ");
        int n = sc.nextInt();
        float result = P(n);
        if(n<0){
            System.out.println("n không hợp lệ");
        }else{
            System.out.println("\n" + result);
        }
    }
}
