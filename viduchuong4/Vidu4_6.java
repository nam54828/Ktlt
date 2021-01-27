package viduchuong4;
import java.util.Scanner;
public class Vidu4_6 {
    public static void main(String[] args) {
        int m ;
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap vao so dong cua ma tran");
            m = sc.nextInt();
            System.out.println("Nhap vao so cot cua ma tran");
            n = sc.nextInt();
        }while(m < 1 || n<1);
        int A[][] = new int[m][n];
        int B[][] = new int[m][n];
        int C[][] = new int[m][n];
        System.out.println("Nhap cac phan tu cho ma tran A:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("A["+i+","+j+"] = ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nhap cac phan tu cho ma tran B:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("B["+i+","+j+"] =");
                B[i][j]=sc.nextInt();
            }
        }
        System.out.println("Ma tran A");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("Ma tran B ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(B[i][j]+"\t");
            }
            System.out.println("\n");
        }
        for (int i=0;i<m;i++)
            for(int j=0;j<m;j++){
                C[i][j]=A[i][j] + B[i][j];
            }
        System.out.println("Ma tran C");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(C[i][j]+"\t");
                }
                System.out.println("\n");
            }
    }
}
