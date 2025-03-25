/**
 * 23030433
 * 赵新航
 * 成绩等级
 */

import java.util.Scanner;
public class dengji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入成绩：");
        double score = sc.nextDouble();
        if(score>100||score<0){
            System.out.println("成绩不合法");
            return;
        }
        if(score>=90){
            System.out.println("成绩等级为：A");
        }else if(score>=80){
            System.out.println("成绩等级为：B");
        }else if(score>=70){
            System.out.println("成绩等级为：C");
        }else if(score>=60){
            System.out.println("成绩等级为：D");
        }else{
            System.out.println("成绩等级为：E");
        }
    }
}
