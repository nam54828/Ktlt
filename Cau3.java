
import java.util.Scanner;
public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        for (int i = 1; i < n; i++) {
            System.out.println("Phan tu thu " + i + ": ");
            A[i] = sc.nextInt();
        }
        System.out.println("Mang vua nhap la: ");
        for (int i = 1; i < n; i++) {
            System.out.println(A[i] + "\t");
        }
        //Tìm phần tử lớn nhất và lớn thứ 2 trong mảng cùng chỉ số của các số đó.
        int max = A[0];
        for (int i = 0; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        System.out.println("Gia trị lớn nhất trong mảng là: " + max);
        int max1 = A[0];
        int max2 = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] > max2) {
                if (A[i] > max1) {
                    max2 = max1;
                    max1 = A[i];
                } else
                    max2 = A[i];
            } else if (max2 >= max1)
                max2 = A[i];
        }
        System.out.println("Gia trị lớn thứ 2 trong mảng là: " + max2);
        //Sắp xếp mảng theo thứ tự giảm dần
        int temp = A[0];
        for (int i = 0 ; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] < A[j]) {
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
            System.out.println(A[i]);
        }
        //Nhập một số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính sắp xếp giảm dần

    }
}

