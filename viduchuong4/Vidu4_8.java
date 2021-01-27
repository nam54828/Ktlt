package viduchuong4;
import java.util.Scanner;
public class Vidu4_8 {
    public static void main(String[] args) {
        int n;
        int kt=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap vao so bac cua ma tran: ");
            n = sc.nextInt();
        }while(n<1);
        int A[][] = new int[n][n];
        System.out.println("Nhap cac phan tu cho ma tran A: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("A["+i+","+j+"] = ");
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Ma tran A vua nhap:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(A[i][j] == A[j][i]){
                    kt =1;
                }else{
                    kt =0;
                }
            }
        }
        if( kt ==1){
            System.out.println("Ma tran vua nhap la ma tran doi xung");
        }else{
            System.out.println("Ma tran vua nhap khong la ma tran doi xung");
        }
    }
}
