package BaiTapCuoiMon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập N:");
        int n=sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=1;i<=n;i++){
            map.put(i,i*i);
        }
        System.out.println(map);
    }
}
