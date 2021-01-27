package ViDu_Chuong_3;

import java.util.Scanner;
public class ac {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nMảng ban đầu");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "\t");
        }
        for(int i=0;i<n;i++){
            int a = (int) Math.sqrt(arr[i]);
            if(a * a == arr[i]){
                System.out.println("Các số chính phương " + arr[i] + "\t");
            }
        }

    }
}