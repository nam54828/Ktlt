package DoDucNam_IT20A3B;
/*
Câu 6: Tạo lớp chương trình Cau6 nhập một số nguyên n từ bàn phím và hiển thị
đây có phải là số chính phương hay không?
 */
import java.util.Scanner;
public class Cau6 {
    static boolean KiemTraSoChinhPhương(double x){
        double sq = Math.sqrt(x);
        return ((sq-Math.floor(sq))==0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số vào cần kiểm tra: ");
        double num = sc.nextDouble();
        if(KiemTraSoChinhPhương(num)){
            System.out.println(num + " Là số chính phương");
        }else{
            System.out.println(num + " không phải là số chính phương");
        }
    }
}
