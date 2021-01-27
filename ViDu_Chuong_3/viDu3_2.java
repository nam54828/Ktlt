package ViDu_Chuong_3;

public class viDu3_2 {
    private String name;
    public  viDu3_2(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        viDu3_2 bkitviDu3_2 = new viDu3_2("Huy Nguyen");
        System.out.println("Ten: "+bkitviDu3_2.getName());
    }
}
