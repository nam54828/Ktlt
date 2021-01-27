package ViDu_Chuong_3;

public class bai21_video {
    int x = 88;

    public static void main(String[] args) {
        int x = 0;
        {
            // int x =99
            System.out.println(x); //ok
            {
                // khối
            }
        }
        System.out.println(x); //ok
    }
    // other block
}
