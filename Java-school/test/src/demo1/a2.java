package demo1;

public class a2 {
    int a;
    static int b;
    void fa(){

    }
    static void fb(){

    }
    public void m1(){
        System.out.println(a);    //位置1
        System.out.println(b);    //位置2
        fa();                     //位置3
        fb();                     //位置4
    }
    public static void m2(){
        //System.out.println(a);    //位置5
        System.out.println(b);    //位置6
        //fa();                    //位置7
        fb();                    //位置8
    }
}


