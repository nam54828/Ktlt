package ViDu_Chuong_3;
// toán tử trong java
/*
- toán tử học: + - * / %
- toán tử gán: = *= /= += -= %=
- toán tử tăng giảm : x++ x-- --x ++x
- toán tử so sánh : > < >= <= == !=
- toán tử logic : &&
- toán tử ba ngôi expression ? x : y
- thứ tự ưu tiên các toán tử
- introduce enum
 */
public class bai8_video {
    /*
    - toán tử số học: + - * / %
    - toán tử gán: = *= /= -= += %=
     */
    public static void main(String[] args) {
        int a=120;
        int b = 255;
        float res = a/(b*1.0f); // phép chia sô thực
        float res2 = a/b; // phép chia số nguyên
       // System.out.println("Phép chia số thực: " + res);
        //System.out.println("Phép chia số nguyên : " + res2);
        //int kq= a%b; // phép chia lấy phần dư
        //System.out.println("Phép chia lấy phần dư: " + kq);
        a = a+ 100;
        // tương đưogn:
        a += 100;
        a*=100; // a = a * 100
    }
}
