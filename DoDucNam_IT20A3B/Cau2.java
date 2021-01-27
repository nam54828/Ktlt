package DoDucNam_IT20A3B;
/*
Câu 2: Tạo lớp chương trình Cau2 nhập 3 số nguyên a, b, c từ bàn phím (yêu cầu a,
b, c phải lớn hơn 2). Hiển thị số có giá trị lớn nhất trong 3 số đó.
 */
import java.util.Scanner;
public class Cau2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int a = sc.nextInt();
        System.out.println("Nhập số b: ");
        int b = sc.nextInt();
        System.out.println("Nhập số c: ");
        int c = sc.nextInt();
        int max;
        max=a;
        if(a>2 && b>2 && c>2) {
            if (max < b) {
                max = b;
            }
            if (max < c) {
                max = c;
            }
            System.out.println("Số lớn nhất trong 3 số a, b, c là: " + max);
        }else{
            System.out.println("Điều kiện a,b,c phải lớn hơn 2");
        }
    }
}
