package DoDucNam_IT20A3B;
/*
Câu 1: Tạo lớp chương trình Cau1 nhập một số nguyên n từ bàn phím (yêu cầu n
phải lớn hơn 2) và hiển thị đây là số chẵn hay là số lẽ.
 */
import java.util.Scanner;
public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập N: ");
        int n =sc.nextInt();
        if(n>2) {
            if (n % 2 == 0) {
                System.out.println(n + " Là số chẵn");
            } else {
                System.out.println(n + " Là số lẻ");
            }
        }else{
            System.out.println("Yêu cầu n >2");
        }
    }
}
