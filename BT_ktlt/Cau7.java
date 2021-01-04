package DoDucNam_IT20A3B;
import java.util.Scanner;
public class Cau7 {
    /*nhập 2 số nguyên x, y từ bàn phím (yêu cầu x, y
    phải lớn hơn 3). Hiển thị giá trị số nguyên x, y đó. Hoán vị giá trị 2 số nguyên đó và
    hiển thị ra màn hình.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = sc.nextInt();
        System.out.println("Nhập số b: ");
        int b = sc.nextInt();
        System.out.println("Gía trị trước khi hoán vị là " + a + "\t" +b);
        int c=a;
        a=b;
        b=c;
        System.out.println("Gía trị sau khi hoán vị là " + a + "\t" + b);
    }
}
