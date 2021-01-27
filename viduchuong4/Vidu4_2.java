package viduchuong4;
import java.util.Scanner;
public class Vidu4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Nhap phan tu thu "+ i +":");
            array[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println("Phan tu thu "+ i + " : " + array[i]);
        }
    }

}
