package StringDemo;

public class StringDemo2 {
    //目标：生成验证码
    public static void main(String[] args) {
        String code = getCode(4);
        System.out.println(code);

        System.out.println(getCode(6));
    }

    //帮我生成指定位数的验证码，每位可能是大小写字母或者数字
    //帮我用string变量记住全部要用到的字符
    public static String getCode(int n){
        //1.定义一个变量记住全部字符
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        //2.循环n次，每次从str中随机抽取一个字符，拼接到code中
        String code = "";

        for (int i = 0; i < n; i++) {
            //3.从str中随机抽取一个字符
            int index = (int)(Math.random()*str.length());//[0,1)*62 = [0,61]
            //4.拼接到code中
            code += str.charAt(index);
        }
        return code;
    }
}
