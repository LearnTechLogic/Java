package demo1;

public class WuMingFen {
    String theMa;
    int quantity;
    boolean likeSoup;

    public WuMingFen() {
        this.theMa = "酸辣面";
        this.quantity = 2;
        this.likeSoup = true;
    }
    public WuMingFen(String theMa,int quantity,boolean likeSoup){
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;

    }
    public WuMingFen(String theMa,int quantity){
        this.theMa = theMa;
        this.quantity = quantity;

    }
    public void check(){
        System.out.println("面码：" + theMa + ",粉的份量：" + quantity + "两，是否带汤：" + likeSoup);
    }
}
