package prepare_Final_Test01;

import java.util.Scanner;

public class cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int n = sc.nextInt();
        int x, y;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= 2 * n; j++) {
                x = j - n;
                if (x < 0) {
                    x *= -1;
                }
                y = i - x;

                if (y > 0) {
                    System.out.print(" " + y);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
