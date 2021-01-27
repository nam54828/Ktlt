package baiTapMang;
/*
Nhập vào một số nguyên dương n, và n số nguyên lần lượt là các phần tử trong dãy a.
Hãy in lần lượt các số nguyên tố có trong dãy a ra màn hình, sau mỗi phần tử có đúng một khoảng trắng.
(Số nguyên tố là số nguyên dương có đúng 2 ước là 1 và chính nó.
Số a được gọi là ước của b nếu b chia hết cho a). Biết rằng dãy sẽ có ít nhất một số nguyên tố.
 */
import java.util.Scanner;
public class bai_5 {
    public static boolean checkSNT(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Phân tử thứ " + i);
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(checkSNT(a[i])){
                System.out.println("Số nguyên tố là: " + a[i]+ " ");
            }
        }
    }
}


