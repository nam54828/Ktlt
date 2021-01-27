package BaiTapCuoiMon;
import java.util.Scanner;
public class cau4 {
    public static boolean checkSNT(int n){
        if(n<2){
            return false;
        }
        for (int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập N: ");
        int n = sc.nextInt();
        int lietKe=0;
        System.out.println("Liệt kê tất cả số có 5 chữ số:");
        for(int i=10001;i<99999;i+=2){
            if(checkSNT(n)){
                System.out.println(i);
                lietKe ++;
            }
        }
        System.out.println("Tổng các chữ số có 5 chữ số là: " + lietKe);
    }
}
