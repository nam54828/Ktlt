package viduchuong4;
/*
Mảng một chiều trong ngôn nguex java
- Định nghĩa , đặc điểm
-khai báo, khởi tạo
-giá trị , mặc định của tuefng kiểu mảng
-Truy xuất thông tin các phần tử của mảng
-Lấy số phần tử của mảng hiện thời
** chỉ số phần tử trong mảng
 */
public class bai31_video {
    public static void main(String[] args) {
//        boolean [] arr = new boolean[100];
//        int n = arr.length;
//        for(int i= 0;i<n;i++){
//            System.out.println(arr[i] + " ");
//            if(i % 20 == 0 ){
//                System.out.println();
//            }
//        }
        int [] arr = new int[10];
        arr[0] = 100;
        arr[1] = 200;
        arr[9] = -99;
        int x = arr[1];
        int n = arr.length;
        System.out.println(x);
    }
}

