package baiTapMang;
/*
Viết chương trình nhập vào một mảng số nguyên có n phần tử,
xuất mảng ra màn hình và cho hiển thị các phần tử có giá trị là số chẵn
 */
import java.util.Scanner;
public class bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Phần tử thứ: " + i );
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                System.out.println("Các giá trị là số chẵn: " + arr[i]);
            }
        }
    }
}

