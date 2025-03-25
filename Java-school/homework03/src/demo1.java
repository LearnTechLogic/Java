/**
 * 23030433
 * 赵新航
 * 古诗排版
 */
public class demo1 {
    public static void main(String[] args) {
        // 古诗原文，使用二维数组存储
        String[][] poem = {
                {"锄", "禾", "日", "当", "午", "，"},
                {"汗", "滴", "禾", "下", "土", "。"},
                {"谁", "知", "盘", "中", "餐", "，"},
                {"粒", "粒", "皆", "辛", "苦", "。"}
        };

        // 输出横版古诗
        System.out.println("横版输出：");
        for (int i=0;i<poem.length;i++) {
            for (int j =0;j<poem[i].length;j++) {
                System.out.print(poem[i][j]);
            }
            System.out.println();
        }

        // 输出竖版古诗
        System.out.println("竖版输出：");
        for (int i = 0; i < poem[0].length; i++) { // 遍历每一列
            for(int j = poem.length-1; j >=0; j--){
                System.out.print(poem[j][i]);
            }
            System.out.println();
        }
    }
}
