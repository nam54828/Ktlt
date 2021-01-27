package viduchuong4;
import java.util.Scanner;
public class Vidu4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so dong cua mang: ");
        int sodong = sc.nextInt();
        System.out.println("Nhap vao so cot cua mang: ");
        int socot= sc.nextInt();
        System.out.println("Nhap vao so cot cua mang: ");
        int [][] A = new int[sodong][socot];
        for(int i=0;i<sodong;i++){
            for (int j=0; j< socot; j++){
                System.out.print("Nhap phan tu thu["+i+","+j+"]: ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("mang vua nhap: ");
        for (int i =0;i<sodong;i++){
            for(int j=0;j<socot;j++){
                System.out.println(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
