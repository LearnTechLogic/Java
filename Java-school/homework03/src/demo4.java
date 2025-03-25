/**
 * 23030433
 * 赵新航
 * 电灯开关
 */
public class demo4 {
    public static void main(String[] args) {
        boolean[] data = new boolean[101];
        for (int i = 1; i < data.length; i++) {
            data[i] = false;
        }
        for(int i =1;i<data.length;i++){
            for(int j=i;j<data.length;j+=i){
                data[j] = !data[j];
            }
        }
        for(int i =1;i<data.length;i++){
            if(data[i]){
                System.out.println(i);
            }
        }
    }
}
