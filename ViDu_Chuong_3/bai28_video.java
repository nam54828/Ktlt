package ViDu_Chuong_3;
// lệnh điều khiển vòng lặp: break, continue
public class bai28_video {
    public static void main(String[] args) {
        int count = 0;
        int i = 99;
        for(int j =0;j<10;j++){
            count =0;
            for(;;){
                if(i % 5 == 0){
                    System.out.println(i);
                    count++;
                }
                if(count == 5){
                    System.out.println("break tai vong lap j= "+ j);
                    break;
               }
                i++;
            }
        }
    }
}
