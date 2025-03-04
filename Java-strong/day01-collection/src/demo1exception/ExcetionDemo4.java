package demo1exception;

public class ExcetionDemo4 {
    public static void main(String[] args)  {
        //自定义异常
        try {
            saveAge(-1);
            System.out.println("年龄正常");
        } catch (AgeIlleageRuntimeExpection e) {
            e.printStackTrace();
            System.out.println("年龄异常,失败");
        }
    }
    //公司系统只要收到年龄小于1岁或者大于200岁就是一个年龄异常
    public static void saveAge(int age) {
        if(age<1||age>200){
            throw new AgeIlleageRuntimeExpection("年龄异常");
        }else{
            System.out.println("年龄正常");
        }
    }
}
