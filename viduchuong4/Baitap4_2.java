package viduchuong4;

import java.util.Scanner;
public class Baitap4_2 {
    public static void main(String[] args) {
        int n,m;
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao so hang cua mang: ");
     n = sc.nextInt();
    System.out.println("Nhap vao so cot cua mang: ");
     m = sc.nextInt();
    int [][] A = new int[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.println("Nhap phan tu thu [" + i + " , " + j + "]: ");
            A[i][j] = sc.nextInt();
        }
    }
    System.out.println("Mang vua nhap: ");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(A[i][j] + "\t");
        }
        System.out.println("\n");
     }
        System.out.println(" ");
    int sum = 0;
    for(int i=0;i<n;i++){
        System.out.println("Tổng giá trị của hàng " + i +"là: ");
        for(int j = 0 ; j < m; j++){
            sum += A[i][j];
        }
        System.out.println(sum);
        sum = 0;
    }
    }
}
