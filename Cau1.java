import java.util.Scanner;
public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = sc.nextInt();
        System.out.println("Nhap y: ");
        int y = sc.nextInt();
        if(x>3 && y>3){
            System.out.println("Truoc khi hoan vi " + x + "\t" +y);
            int c = x;
            x=y;
            y=c;
            System.out.println("Sau khi hoan vi " + x +"\t" +y);
        }else{
            System.out.println("Yeu cau nhap lai: Dieu kien sai");
        }
    }
}
