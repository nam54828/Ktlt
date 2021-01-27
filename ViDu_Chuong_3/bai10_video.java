package ViDu_Chuong_3;
// toán tử logic && toán tử ba ngôi expression ? x : y
public class bai10_video {
    public static void main(String[] args) {
        int a = 5;
        int b =6;
        System.out.println((a>b)&&(a==b));
        // để phép && cho kq TRUE: trái:true &&& phải : true
        System.out.println((a>b));
        System.out.println(!(a>b));
        // kq phép hoặc | chỉ sai khi cả 2 vế sai
        String res = "";
        res = (a > b) ? "a > b" : "a<=b";
        System.out.println(res);
    }
}
