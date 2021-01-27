package ViDu_Chuong_3;
// cấu trúc điều khiển lặp for
public class bai24_video {
    public static void main(String[] args) {
        // lặp lại việc thực hiện 1 nhiệm vụ nào đó
        /*
        for(khởi tạo; điều kiện lặp; bước nhảy)
   làm cái gì đó
         */
        for(int i=100 ; i>=0;i-=2){
            if( i % 5 ==0){
                System.out.println(i);
            }
        }
    }
}
