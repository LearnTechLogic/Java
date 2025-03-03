package com.itheima.array;

public class arraydemo2 {
    public static void main(String[] args) {
        printStudentScore();
    }
    //假设班级有8名学生，请帮我开发程序可以计算学生成绩
    public static void printStudentScore(){
        double[] scores = new double[8];
        for (int i = 0; i < scores.length; i++){
            scores[i] = Math.random()*100;
        }
        int[] score = {100,99,98,97,96,95,94,93};
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println(sum);
    }
}
