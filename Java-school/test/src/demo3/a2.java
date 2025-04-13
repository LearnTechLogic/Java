package demo3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class a2 {
    /********* Begin *********/
    //请在合适的部位添加代码
    public static void main(String[] args) {
        try {
            test();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("读取文件时发生错误");
        }
    }

    public static void test() throws FileNotFoundException, IOException {
        File file = new File("abc");
        if (!file.exists()) { //判断文件是否存在
            //文件不存在，则 抛出 文件不存在异常
            throw new FileNotFoundException("该文件不存在");
        } else {
            FileInputStream fs = new FileInputStream(file);
            // 假设这里有一些读取文件的代码
            fs.close(); // 关闭文件流
        }
    }
    /********* End *********/
}
