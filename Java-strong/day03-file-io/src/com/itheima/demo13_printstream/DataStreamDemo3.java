package com.itheima.demo13_printstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamDemo3 {
    public static void main(String[] args) {
        // 目标：特殊数据流的使用。
       try (
               DataInputStream dis = new DataInputStream(new FileInputStream("day03-file-io\\src\\data.txt"));
               ){
           System.out.println(dis.readByte());
           System.out.println(dis.readUTF());
           System.out.println(dis.readInt());
           System.out.println(dis.readDouble());
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
