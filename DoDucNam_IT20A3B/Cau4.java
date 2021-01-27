package DoDucNam_IT20A3B;
/*
Câu 4: Tạo lớp chương trình Cau4 giải phương trình bậc 2: ax 2 + bx = 0.
 */
import java.util.Scanner;
public class Cau4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        float a= sc.nextFloat();
        System.out.println("Nhập b: ");
        float b = sc.nextFloat();
        float delta = b*b;
        if(delta < 0){
            System.out.println("Phương trình vô nghiệm");
        }else if(delta > 0){
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.println("X1= "+ (-b+Math.sqrt(delta))/(2*a));
            System.out.println("X2= "+ (-b-Math.sqrt(delta))/(2*a));
        }else{
            System.out.println("Phương trình có một nghiệm kép X= "+ (-b/(2*a)));
        }
    }
}
