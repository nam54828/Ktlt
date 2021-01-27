package DoDucNam_IT20A3B;
/*
Câu 5: Tạo lớp chương trình Cau5 nhập một số nguyên n từ bàn phím và hiển thị
đây có phải là số nguyên tố hay không?
 */
import java.util.Scanner;
public class Cau5 {
    public static boolean checkSNT(int n){
            if(n<2){
                return false;
            }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        if(checkSNT(n)){
            System.out.println(n + " là số nguyên tố");
        }else{
            System.out.println("Không phải là số nguyên tố");
        }
    }
}
