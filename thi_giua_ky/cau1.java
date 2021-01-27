package thi_giua_ky;
import java.util.Scanner;
public class cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        int n = sc.nextInt();
         if(n>2) {
             if (n % 2 == 0)
                 System.out.print("\nso chan");
             else
                 System.out.print("\nso le");
         }else{
             System.out.println("Lỗi ");
         }

    }
}
