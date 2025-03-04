public class runnian {
    public static void main(String[] args) {
       test1();
        System.out.println("-------------------------------------------------");
       test2();
    }
    //判断1950-2050年中的闰年（两种方法）
    public static void test1() {
        for (int i = 1950; i <= 2050; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i + "是闰年\t");
            }
            if(i % 16 == 0)
                System.out.println();
        }
    }
    public static void test2(){
        int i;
        for (i = 1950; i <= 2050; i++){
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                break;
            }
        }
        for(;i<=2050;i+=4){
            System.out.print(i + "是闰年\t");
            if(i % 16 == 0)
                System.out.println();
        }
    }
}
