package baiTapMang;
/*
Viết chương trình nhập vào một mảng 2 chiều,
xuất mảng ra màn hình và đếm số phần tử là số lẻ
 */
import java.util.Scanner;
public class bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] % 2 != 0)
                System.out.println("Số phần tử lẻ: " + arr[i][j]);
            }
        }
    }
}
