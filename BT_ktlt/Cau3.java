package DoDucNam_IT20A3B;
/*
Câu 3: Tạo lớp chương trình Cau3 giải phương trình bậc 1: ax + b = 0.
 */
import java.util.Scanner;
public class Cau3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a = sc.nextFloat();
        System.out.println("Nhập b: ");
        float b = sc.nextFloat();
        if(a==0 && b==0){
            System.out.println("Phương trình có vô số nghiệm");
        }else if(a==0 && b !=0){
            System.out.println("Phương trình vô nghiệm");
        }else{
            System.out.println("Phương trình có nghiệm x= "+ (-b/a));
        }
    }
}
