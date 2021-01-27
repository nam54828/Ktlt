package baitapcuoiki;
import java.util.Scanner;
public class cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        // Viết hàm Nhập và hiển thị các giá trị trong mảng A?
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + i + ": ");
            A[i] = sc.nextInt();
        }
        System.out.println("mang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.println(A[i] + "\t");
        }
        //Viết chương trình sắp xếp các phần tử của mảng A theo thứ tự tăng dần
        int temp =A[0];
        for(int i=0;i<A.length ; i++){
            for(int j=0;j< A.length-1;j++){
                if(A[i]<A[j]){
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
        System.out.print("Thu tu tang dan la: ");
        for(int i=0;i<n;i++)
            System.out.println(A[i] + " ");
        //Viết hiển thị ra tổng của phần tử đầu tiên và cuối cùng trong mảng A
            System.out.println("Tong phan tu dau tien va phan tu cuoi cung la: " + (A[0] + A[n - 1]));
        /*Viết hàm đếm xem có bao nhiêu phần tử trong mảng A có giá trị lớn hơn hoặc bằng giá trị
         trung bình của tất cả các giá trị trong mảng A.
         */
        int tong =0;

        for(int i=0;i<n;i++){
            tong +=A[i];
        }
        int TB = tong/n;
        int Dem1=0;
        for(int i=0;i<n;i++){
            if(A[i] >=TB){
                Dem1++;
            }
        }
        System.out.println("Co " + Dem1 + " phan tu A co gia tri lon hon hoac bang gia tri trung binh cua tat ca gia tri");
        //Viết hàm hiển thị ra màn hình những số chẵn trong mảng A
        System.out.println("Trong mảng A có các giá trị chẵn là: ");
        for(int i=0;i<n;i++){
            if(A[i]%2==0){
                System.out.println( A[i]);
            }
        }


    }
}
