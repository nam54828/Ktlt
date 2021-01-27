package baitapcuoiki;
import java.util.Scanner;
//Viết chương trình nhập 1 số nguyên N (N >= 5) và tính tổng sau:
//S = 1 + 1/2! + 1/3! + ... + 1/n! (n > 0)
public class cau4{

    public static void main(String[] args) {
        int n;
        float sum = 0, temp = 1;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Mời bạn nhập vào số n: ");
            n = scanner.nextInt();
        } while (n < 2);

        /*
         * tính giá trị của biểu thức
         * i còn nhỏ hơn hoặc bằng n thì còn thực hiện thân vòng lặp
         */
        for (int i = 1; i <= n; i++) {
            temp *= i;  // tính giai thừa
            sum += (float) 1/temp;
        }

        System.out.println("Tổng = " + sum);
    }

}


