
import java.util.Scanner;

public class Cau2 {
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
        //Viết hàm đếm trong mảng A có bao nhiêu giá trị chia hết cho 3 mà không chia hết cho 2?
        int dem = 1;
        for (int i = 0; i < n; i++) {
            if (A[i] % 3 == 0 && A[i] % 2 != 0) {
                dem++;
            }
        }
        System.out.println("co " + dem + " so phan tu chia het cho 3 va khong chia het cho 2");
        //Viết hàm tìm giá trị lớn nhất trong mảng A?
        int max = A[0];
        for (int i = 0; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Gia trị lớn nhất trong mảng là: " + max);
        //Viết hàm kiểm tra xem giá trị X (Nhập vào từ bàn phím) có tồn tại trong mảng A
        //hay không?
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
        //Viết hàm đếm số phần tử trong mảng A có giá trị Chẵn?
        int Dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                Dem++;
            }
        }
        System.out.println("Trong mảng A có " + Dem + " giá trị chẵn");
        //Viết hàm tách tất cả các giá trị chẵn trong mảng A vào các mảng B (chứa các giá trị chẵn)
        int j =0;
        int[] B = new int[n];
        for (int i=0;i<n;i++) {
            if (A[i] % 2 == 0) {
                B[j] = A[i];
                j++;
            }
        }
        System.out.println("Cac phan tu so chan trong mang B la: ");
        for (int i = 0; i < j; i++) {
            System.out.println(B[i] + "\t");

        }
    }
}

