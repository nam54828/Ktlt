package viduchuong4;
// mảng 2 chiều p2 vs vòng lặp for each
import java.util.Arrays;
/*
 Mảng 2 chiều trong Java:
 1.Định nghĩa , khai báo , khởi tạo
 2.Truy xuất , gán phần tử mảng
 3. sử dụng for each với mảng 2 chiều
 4. Mảng zigzag
*/
public class bai36_video {
    public static void main(String[] args) {
        //Tổng quát: Kiểu [][] tên mảng;
        int[][] arr = new int[4][3];
        /*chi so bat ki: 0 -> length-1 */
        arr[0][0] = 100;
        arr[0][1] = 200;
        arr[arr.length - 1][arr[0].length - 1] = -999;
        boolean[][] booleans = new boolean[9][9];
        String[][] strings = new String[2][3];
        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {0, 1, 9, 8}
        };
//        // gán các phần tử của mảng
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                arr[i][j] = i*j;
//            }
//        }
//        //xuat các phần tử của mảng
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.println(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println("Truy xuất mảng hai chiều sử dụng for each");
//        for(String[] x : strings){
//            for(String y: x){
//                System.out.print(y+" ");
//            }
//            System.out.println();
//        }
        int[][] arr3 = new int[10][];
        for(int i=0;i< arr3.length;i++){
            arr3[i]=new int[i+1];
            for(int j=0;j< arr3[i].length;j++){
                arr3[i][j] = i + j;
            }
        }
        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++){
                System.out.println(arr3[i][j]+ " ");
            }
            System.out.println();
        }
    }
}