package finaldemo;

public class finaldemo1 {

    public static final int a = 10;

    public static void main(String[] args) {
        final int a = 10;//有且只能赋值一次
        //a = 20;

    }
    final class a{}
    //class b extends a{}



    class c{
        final int a = 10;
        //a = 20;
        public final void test(){
            //a = 20;
        }
    }

    class d extends c{
        //@Override
        //public void test(){
            //a = 20;
        //}
    }
}
