package com.itheima.demo09bufferedInputStream;

import java.io.*;

public class CopyDemo1 {
    public static void main(String[] args) {
        // 目标：掌握缓冲字节流的使用。
        // 源文件：E:\resource\jt.jpg
        // 目标文件：D:\jt_new.jpg （复制过去的时候必须带文件名的，无法自动生成文件名。）
        copyFile("E:\\resource\\jt.jpg", "D:\\jt_new2.jpg");
    }

    // 复制文件
    public static void copyFile(String srcPath, String destPath)  {
        // 1、创建一个文件字节输入流管道与源文件接通
        try (
                // 这里只能放置资源对象，用完后，最终会自动调用其close方法关闭！！
                InputStream fis = new FileInputStream(srcPath);
                // 把低级的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(fis);

                OutputStream fos = new FileOutputStream(destPath);
                // 把低级的字节输出流包装成高级的缓冲字节输出流
                OutputStream bos = new BufferedOutputStream(fos);
                ){
            // 2、读取一个字节数组，写入一个字节数组  1024 + 1024 + 3
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len); // 读取多少个字节，就写入多少个字节
            }
            System.out.println("复制成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

