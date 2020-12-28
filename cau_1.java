import java.util.Scanner;
public class cau_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N: ");
        int n =sc.nextInt();
        if(n>2){
            if(n%2 ==0){
                System.out.println( n + " la so chan");
            }else{
                System.out.println(n+ " la so le");
            }
        }else{
            System.out.println("N nho hon 2 : Math erro");
        }
    }
}
