package Code;

public class CodeDemo2 {
    private String name;
    private String[] ditection = new String[4];//实例变量
    //实例代码块，无static修饰，属于对象，每次创建对象时，都会优先执行一次
    //基本作用：初始化对象属性，只执行一次
    {
        System.out.println("实例代码块");
        name = "小红";
        ditection[0] = "北";
        ditection[1] = "南";
        ditection[2] = "东";
        ditection[3] = "西";
    }
    public static void main(String[] args) {
        //目标：实力代码块
        System.out.println("main方法");
        new CodeDemo2();
        new CodeDemo2();
        new CodeDemo2();
    }
}
