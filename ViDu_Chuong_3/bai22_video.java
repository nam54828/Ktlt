package ViDu_Chuong_3;
// cấu trúc if , if-else
public class bai22_video {
    public static void main(String[] args) {
        //int a =5;
        float mark=9.5f;
        //if( a % 2 == 0){
          //  System.out.println("a là số chẵn ");
        //}else{
          //  System.out.println("a là số lẻ");
    //    }
        if(mark >= 9.0){
            System.out.println("XS");
        }else if(mark <= 8.9 && mark >= 8.0){
            System.out.println("GIOI");
        }else if(mark <= 7.9 && mark >= 6.0){
            System.out.println("KHA");
        }else{
            System.out.println("TB");
        }
    }
}
