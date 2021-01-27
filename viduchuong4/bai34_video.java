package viduchuong4;
import java.util.Arrays;
import java.util.Scanner;
public class bai34_video {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5,3,2,0,1,4,7,8,9,10,13};
        String[] names = {"Than","Hoa","Hung","Khanh","Trung","Nam","Tran"};
//        String res = Arrays.toString(names);
//        System.out.println(res);
//        Arrays.sort(arr);
//        Arrays.sort(names);
//        //int index = Arrays.binarySearch(names, "Tran");
//        int index = Arrays.binarySearch(names,4, names.length, "Tran");
//        System.out.println("Sau khi sap xep: ");
//        System.out.println(Arrays.toString(names));
//        System.out.println("Index = " + index);
        String[] name2 = Arrays.copyOf(names, 5);
        System.out.println("Names = " + Arrays.toString(names));
        System.out.println("Names2 = " + Arrays.toString(name2));
        System.out.println("is names equal name2 ? " + Arrays.equals(names, name2));
        int [] myArray = new int[20];
        Arrays.fill(myArray, 99);
        System.out.println(Arrays.toString(myArray));
    }
}
