package demo1exception;

public class ExcetionDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println(div(10, 0));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("除数不能为0,3");
        }
    }
    public static int div(int a,int b) throws Exception{
        if(b==0){
            System.out.println("除数不能为0,1");
            //return -1;
            throw new Exception("除数不能为0,2");
            // throw new RuntimeException("除数不能为0");
        }
        int result = a/b;
        return result;
    }
}
