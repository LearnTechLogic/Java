package demo1exception;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcetionDemo1 {
    public static void main(String[] args)  {
        //认识异常体系，搞清楚异常的基本作用
        show();
        //show1();
        try {
            show1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //定义一个方法认识编译时异常
    public static void show1() throws Exception {
        //编译时异常，必须处理，否则编译不通过
        //File file = new File("d:\\a.txt");
        //FileInputStream fis = new FileInputStream(file);
        String str ="2024-7-09 11:12:13";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);

        InputStream inputStream = new FileInputStream("D://meinv.png");

    }


    //定义一个方法认识运行时的异常
    public static void show(){
        int[] arr = {1,2,3};
        //System.out.println(arr[3]);

        //System.out.println(10/0);

        //空指针异常
        String str = null;
        //System.out.println(str.length());

    }
}
