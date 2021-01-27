package chuong_6;
import java.util.Scanner;
public class baitap6_2 {
    static int P(int n){
        if(n==0){
            return 1;
        }else{
            return ((2*n+1)*P(n-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương N: ");
        int n = sc.nextInt();
        int result = P(n);
        if(n<0){
            System.out.println("\nn không hợp lệ");
        }else{
            System.out.println(result);
        }
    }
}
