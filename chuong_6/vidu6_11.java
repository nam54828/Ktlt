package chuong_6;
// Ham tra ve vi tri xuat hien dau tien
public class vidu6_11 {
    public static void main(String[] args) {
        int result;
        String string1="Happy new year!";
        String string2="new year!";
        result = string1.indexOf(string2);
        System.out.println("Vi tri dau tien xuat hien chuoi " + string2 +
                "trong chuoi " + string1 + "= " + result);
    }
}
