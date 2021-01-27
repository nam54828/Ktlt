package viduchuong4;

import java.util.Scanner;
public class Baitap4_1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int [] arr = new int [n];
       for(int i=0;i<n;i++){
           System.out.println("Nhập phần tử thứ " + i + ": ");
           arr[i] = sc.nextInt();
       }
       System.out.println("\nMảng ban đầu");
       for(int i=0;i<n;i++){
           System.out.println(arr[i] + "\t");
       }
       for(int i=0;i<n;i++){
           if(arr[i]%2!=0){
               System.out.println("Gia tri le cua mang : \n" + arr[i]);
           }
       }
    }
}

