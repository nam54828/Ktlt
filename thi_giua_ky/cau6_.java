package thi_giua_ky;
import java.util.Scanner;
public class cau6_ {
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        int a=sc.nextInt();
        System.out.println("Nhap b");
        int b = sc.nextInt();
        int result = USCLN(a,b);
        if(a<0 || b<0){
            System.out.println("khong hop le");
        }else{
            System.out.println("ucln"+result);
        }
    }
}
