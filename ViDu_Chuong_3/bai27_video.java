package ViDu_Chuong_3;
// vòng lặp lồng nhau
public class bai27_video {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k < 99;k++){
                    System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                }
            }
        }
    }
}
