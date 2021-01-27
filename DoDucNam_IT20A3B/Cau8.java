package DoDucNam_IT20A3B;
/*
Câu 8: Tạo lớp chương trình Cau8 nhập 2 số nguyên a, b từ bàn phím và hiển thị
ước số chung lớn nhất của 2 số đó?
 */
import java.util.Scanner;
public class Cau8 {
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = sc.nextInt();
        System.out.println("Nhập số b: ");
        int b =sc.nextInt();
        int result = USCLN(a,b);
        if(a <0 || b <0){
            System.out.println("Không hợp lệ");
        }else{
            System.out.println("UCLN của 2 số a và b là: " + result);
        }
    }
}
