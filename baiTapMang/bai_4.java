package baiTapMang;
/*
Viết chương trình nhập vào một mảng 2 chiều, cho hiển thị các phần tử nằm trên dòng số 3
 */
import java.util.Scanner;
public class bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        int n = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập phần tử thứ [" + i + "," + j + "] ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Các phần tử dòng 3 là: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 2) {
                    if (j < m) {
                        System.out.println(arr[i][j] + "\t");
                    }
                }
            }
        }
    }
}

