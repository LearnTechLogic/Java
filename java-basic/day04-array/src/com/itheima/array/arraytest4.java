package com.itheima.array;

public class arraytest4 {
    public static void main(String[] args) {
        start();
    }
    //创建一个动态初始化的数组存储54张牌
    public static void start(){
        String[] cards = new String[54];
        //准备四种花色，和点数
        String[] points = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] colors = {"红桃","黑桃","梅花","方块"};
        for (int i = 0; i < cards.length; i++) {
            if(i<=12){
                cards[i] = points[i]+colors[0];
            }else if(i>12&&i<=25){
                cards[i] = points[i-13]+colors[1];
            }else if(i>25&&i<=38){
                cards[i] = points[i-26]+colors[2];
            }else if(i>38&&i<=51){
                cards[i] =points[i-39]+colors[3];
            }
            else if(i==52){
                cards[i] = "小王";
            }
            else if(i==53){
                cards[i] = "大王";
            }
        }
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i]+"\t");
        }
        System.out.println();
        shuffle(cards);
    }
    //洗牌
    public static void shuffle(String[] cards){
        for (int i = 0; i < cards.length; i++) {
            int index = (int)(Math.random()*54);
            String temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i]+"\t");
        }
    }
}
