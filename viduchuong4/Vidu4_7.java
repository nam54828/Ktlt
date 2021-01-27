package viduchuong4;
import java.util.Scanner;
public class Vidu4_7 {
    public static void main(String[] args) {
        int m;
        int n;
        int SoPhanTu0 =0;
        int SoPhanTukhac0=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap vao so dong ma tran");
            m=sc.nextInt();
            System.out.println("Nhap vao so cot ma tran");
            n=sc.nextInt();
        }while(n<1 || m<1);
        int A[][] = new int[m][n];
        System.out.println("Nhap cac phan tu cho ma tran A");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("A[" + i + "," + j + "] =");
                A[i][j]= sc.nextInt();
            }
        }
        System.out.println("Ma tran A vua nhap: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(A[i][j] == 0){
                    SoPhanTu0++;
                }else{
                    SoPhanTukhac0++;
                }
            }
        }
        if(SoPhanTu0 > SoPhanTukhac0){
            System.out.println("Ma tran vua nhap la thua");
        }else{
            System.out.println("Ma tran vua nhap khong thua");
        }
    }
}
