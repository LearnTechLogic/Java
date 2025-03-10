package com.itheima.demo13_printstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataStreamDemo2 {
    public static void main(String[] args) {
        // 目标：特殊数据流的使用。
       try (
               DataOutputStream dos = new DataOutputStream(new FileOutputStream("day03-file-io\\src\\data.txt"));
               ){
           dos.writeByte(34);
           dos.writeUTF("你好");
           dos.writeInt(3665);
           dos.writeDouble(9.9);
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
