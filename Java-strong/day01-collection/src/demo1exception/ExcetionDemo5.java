package demo1exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcetionDemo5 {
    public static void main(String[] args) {
        try {
            show();
            System.out.println("操作成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("操作失败");
        }
    }
    public static void show() throws Exception {
        //编译时异常，必须处理，否则编译不通过
        //File file = new File("d:\\a.txt");
        //FileInputStream fis = new FileInputStream(file);
        String str ="2024-7-09 11:12:13";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str);
        System.out.println(date);

        InputStream inputStream = new FileInputStream("D://meinv.png");

    }
}
