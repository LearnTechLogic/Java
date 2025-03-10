package com.itheima.demo13_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamDemo1 {
    public static void main(String[] args) {
        // 目标：打印流的使用。
       try (
//               PrintStream ps = new PrintStream("day03-file-io/src/ps.txt");
               PrintStream ps = new PrintStream(new FileOutputStream("day03-file-io/src/ps.txt", true));
//               PrintWriter ps = new PrintWriter("day03-file-io/src/ps.txt");
               ){
           ps.println(97);
           ps.println('a');
           ps.println("黑马");
           ps.println(true);
           ps.println(99.9);
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
