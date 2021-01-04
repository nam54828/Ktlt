package DoDucNam_IT20A3B;
import java.util.Scanner;
public class Cau10 {
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
        //Viết hàm đếm trong mảng A có bao nhiêu giá trị chia hết cho 5 mà không chia hết cho 6?
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 5 == 0 && A[i] % 6 != 0) {
                dem++;
            }
        }
        System.out.println("co " + dem + " so phan tu chia het cho 5 va khong chia het cho 6");

        //Viết hàm đếm số phần tử trong mảng A có giá trị lẻ?
        int Dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 != 0) {
                Dem++;
            }
        }
        System.out.println("Co " + Dem + " so phan tu so le");
        //Viết hàm tách tất cả các giá trị lẻ trong mảng A vào mảng C (Chứa các giá trị lẻ)
        int j =0;
        int[] C = new int[n];
        for (int i=0;i<n;i++) {
            if (A[i] % 2 != 0) {
                C[j] = A[i];
                j++;
            }
        }
        System.out.println("Cac phan tu so le la trong mang C la: ");
        for (int i = 0; i < j; i++) {
            System.out.println(C[i] + "\t");

        }
        /*
         Viết hàm đếm xem có bao nhiêu phần tử trong mảng A có giá trị lớn hơn
         hoặc bằng giá trị trung bình của tất cả các giá trị trong mảng A.
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

        //Viết hàm kiếm tra xem trong mảng A có tồn tại phần tử nào xuất hiện lặp lại hay không?
        int X, m;
        System.out.println("Nhap vao gia tri can kiem tra");
        m = sc.nextInt();
        for (X = 0; X < n; X++) {
            if (A[X] == m) {
                System.out.println(m + " dang ton tai trong mang A");
                break;
            }
        }
        if (X == n)
            System.out.println(m + " khong ton tai trong mang A");

    }
}
