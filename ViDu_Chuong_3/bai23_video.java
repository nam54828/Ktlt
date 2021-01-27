package ViDu_Chuong_3;
// cấu trúc rẽ nhánh case switch
public class bai23_video {
    public static void main(String[] args) {
        String dk = "TOI";
        switch (dk){
            case "SANG":
                //do something in this case
                System.out.println("Buổi sáng tốt lành!");
                break;
            case "TRUA":
                //do something in this case
                System.out.println("Buổi trưa an lành!");
                 break;
            case "CHIEU":
                //do something in this case
                System.out.println("Buổi chiều mát mẻ h!");
                break;
            case "TOI":
                //do something in this case
                System.out.println("Buổi tối vui vẻ!");
                break;
            default:
                System.out.println("Một ngày tốt lành");
                break;
        }
    }
}
