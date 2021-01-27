package viduchuong4;
// mảng 2 chiều p1
import java.util.Arrays;
/*
 Mảng 2 chiều trong Java:
 1.Định nghĩa , khai báo , khởi tạo
 2.Truy xuất , gán phần tử mảng
 3. sử dụng for each với mảng 2 chiều
 4. Mảng zigzag
*/
public class bai35_video {
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
        // gán các phần tử của mảng
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = i*j;
            }
        }
        //xuat các phần tử của mảng
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
