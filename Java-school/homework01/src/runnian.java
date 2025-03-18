/**
 * 23030433
 * 赵新航
 * 闰年的判断
 */
public class runnian {
    public static void main(String[] args) {
       test1();
        System.out.println("\n-------------------------------------------------");
       test2();
    }
    public static void test1() {
        for (int i = 1950; i <= 2050; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i + "是闰年\t");
            }
            if((i+4) % 16 == 0)
                System.out.println();
        }
    }
    public static void test2(){
        for (int i = 1950; i <= 2050; i++) {
            if (isRunNian(i)) {
                System.out.print(i + "是闰年\t");
            }
            if((i+4) % 16 == 0)
                System.out.println();
        }
    }
    public static boolean isRunNian(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
