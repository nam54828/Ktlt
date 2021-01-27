package chuong_6;

import java.util.Scanner;

public class baitap6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần đếm: ");
        String s = sc.nextLine();
        String[] dem = s.split(" ");
        System.out.println("Số từ trong chuỗi là: "+(dem.length));
    }
}