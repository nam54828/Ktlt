package viduchuong4;
//Khởi tạo các phần tử trong mảng
public class bai33_video {
    public static void main(String[] args) {
        // cách 1
        // int [] arr = { 1,2,3,4,5,5,6,7,9);
        // cách 2
        int[] arr = new int[]{1,2,3,4,5,6,7,5,4};
        int len= arr.length;
        // cách 3
        int[] b = new int[20];
        for(int i=0;i<b.length;i++){
            b[i]=1;
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
