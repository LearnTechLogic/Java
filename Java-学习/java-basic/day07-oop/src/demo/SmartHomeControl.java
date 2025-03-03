package demo;

public class SmartHomeControl {
    private static final SmartHomeControl instance = new SmartHomeControl();
    private  SmartHomeControl () {}
    public static SmartHomeControl getInstance() {
        return instance;
    }
    public static void printAllStatus(JD[] jds) {
        for (int i = 0; i < jds.length; i++) {
            System.out.println((i+1) + jds[i].getName() + "目前状态：" + (jds[i].isStatus()?"开着":"关闭"));
        }
    }

    public void control(JD jd)
    {
        System.out.println("开始您的操作");
        System.out.println(jd.getName() + "目前状态：" + (jd.isStatus()?"开着":"关闭"));
        jd.press();
        System.out.println(jd.getName() + "现在状态：" + (jd.isStatus()?"开着":"关闭"));
    }
}
