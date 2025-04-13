package demo3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class a6 {
    public static void main(String[] args) throws FileNotFoundException{
        test();
    }
    public static void test() throws FileNotFoundException{
        File file = new File("abc");
        if (!file.exists()) {
            throw new FileNotFoundException("该文件不存在");
        }else {
            FileInputStream fs = new FileInputStream(file);
        }
    }
}
