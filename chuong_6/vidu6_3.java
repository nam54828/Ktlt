package chuong_6;
// Tinh N giai thua
public class vidu6_3 {
    static int factorial(int n){
        if(n==1)
            return 1;
        else
            return(n*factorial(n-1));
    }

    public static void main(String[] args) {
        System.out.println("Giai thua cua 5 la: " + factorial(5));
    }
}
