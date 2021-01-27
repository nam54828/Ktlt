package thi_giua_ky;
import java.util.Scanner;
public class cau5_ {
    public static boolean checkSNT(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhạp n: ");
        int n =sc.nextInt();
        if(checkSNT(n)){
            System.out.println("Số nguyeent tố " + n);
        }else{
            System.out.println("khong phai la so nguyen to");
        }
    }
}
