package prepare_Final_Test01;

import java.util.Scanner;

public class cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số phần tử trong mảng : ");
        int n = sc.nextInt();
        int[] A = new int[n];

        /*
        1.Viết hàm Nhập và hiển thị các giá trị trong mảng A?
         */
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            A[i] = sc.nextInt();
        }
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
        /*
        2. Viết hàm đếm trong mảng A có bao nhiêu giá trị chia hết cho 3 mà không chia hết cho 4?
         */
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 3 == 0 && A[i] % 4 !=0 ) {
                    dem++;
            }
        }
        System.out.print("\nCó " +dem +" giá trị chia hết cho 3 mà không chia hết cho 4 là :");

        /*
        3.Viết hàm tìm giá trị lớn nhất và nhỏ nhất trong mảng A?
         */
        int Max = A[0];
        int Min = A[0];
        for (int i = 0; i < n; i++) {
            if (Max < A[i]) {
                Max = A[i];
            }
            if (Min > A[i]) {
                Min = A[i];
            }
        }
        System.out.println("\nGiá trị lớn nhất trong mảng là : " + Max);
        System.out.println("\nGiá trị nhỏ nhất trong mảng là : " + Min);

        /*
        4.Viết hàm kiếm tra xem giá trị X (Nhập vào từ bàn phím) có tồn tại trong mảng A hay không?
         */
        int X, m;
        System.out.println("Nhập vào giá trị cần kiểm tra trong mảng");
        m = sc.nextInt();
        for (X = 0; X < n; X++) {
            if (A[X] == m) {
                System.out.println(m + " Đang tồn tại trong mảng ");
                break;
            }
        }
        if (X == n)
            System.out.println(m + " Không tồn tại trong mảng.");


        /*
        5.Viết hàm đếm số phần tử trong mảng A có giá trị Chẵn?
         */
        int Dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                Dem++;
            }
        }
        System.out.println("\nCó " +dem+" số chẵn trong mảng ");

        /*
        6.Viết hàm tách tất cả các giá trị chẵn trong mảng A vào các mảng B (chứa các giá trị chẵn)
         */
        int j =0;
        int[] B = new int[n];
        for (int i=0;i<n;i++) {
            if (A[i] % 2 == 0) {
                B[j] = A[i];
                j++;
            }
        }
        System.out.println("Các phần tử của mảng chẵn  là: ");
        for (int i = 0; i < j; i++) {
            System.out.print(B[i] + "\t");
        }
    }
}
