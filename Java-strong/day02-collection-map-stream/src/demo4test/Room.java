package demo4test;

import java.util.*;

public class Room {
    // 1、准备好54张牌，给房间使用：定义一个集合容器装54张牌。
    private List<Card> allCards = new ArrayList<>();
    // 2、初始化54张牌进去。
    {
        // 3、准备点数
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 4、准备花色
        String[] colors = {"♥", "♦", "♣", "♠"};
        // 5、组合点数和花色成为牌对象，加入到集合中去。
        int num = 0;
        for (String size : sizes) {
            num++;
            for (String color : colors) {
                // 6、创建牌对象
                Card card = new Card(size, color,num);
                // 7、加入到集合中去
                allCards.add(card);
            }
        }
//        allCards.add(new Card("", "🃏"));
//        allCards.add(new Card("", "👲"));
        Collections.addAll(allCards, new Card("", "🃏", ++num), new Card("", "👲", ++num));
        System.out.println("新牌是：" + allCards);
    }
    public void start() {
        // 8、洗牌：随机打乱集合中的顺序。
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);

        // 9、发牌 : 定义三个玩家： 令狐冲=【】，令狐白=【】，令狐紫=【】
        Map<String, List<Card>> players = new HashMap<>(); // 令狐冲=【】，令狐白=【】，令狐紫=【】

        List<Card> lhc = new ArrayList<>();
        players.put("令狐冲", lhc);

        List<Card> lhb = new ArrayList<>();
        players.put("令狐白", lhb);

        List<Card> lhz = new ArrayList<>();
        players.put("令狐紫", lhz);

        // allCards = [7♠, 6♣, K♦, J♠, 2♠, 2♥, 9♠, 10♣, J♣, 8♦, 7♣, 8♣, 7♦, 3♥, 10 ...
        // 只发出去51张：0   1    2   3   4   5   6   7 ...
        for (int i = 0; i < allCards.size() - 3; i++) {
            // 获取到当前遍历的牌
            Card card = allCards.get(i);
            // 判断当前这张牌发给谁
            if (i % 3 == 0) {
                // 请啊冲接牌
                lhc.add(card);
            } else if (i % 3 == 1) {
                // 请啊白接牌
                lhb.add(card);
            } else if (i % 3 == 2){
                // 请啊紫接牌
                lhz.add(card);
            }
        }



        // 10、拿最后三种底牌：
        List<Card> lastCards = allCards.subList(allCards.size() - 3, allCards.size());
        System.out.println("底牌：" + lastCards);

        // 抢地主：把这个集合直接倒给玩家
        lhz.addAll(lastCards);

        // 11、对牌排序（交给大家自己做）
        // List<Card> lhc = [10♥, 3♣, 3♠, K♠, 5♣, 👲, Q♥, J♠, 6♦, 6♣, J♣, J, ...
        sortCards(lhc);
        sortCards(lhb);
        sortCards(lhz);

        // 12、看牌，遍历Map集合
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            // 获取到玩家名称
            String name = entry.getKey();
            // 获取到玩家牌
            List<Card> cards = entry.getValue();
            // 遍历玩家牌
            System.out.println(name + " 的牌是 " + cards);
        }
    }

    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                // o1  2♠
                // o2  J♠
                return o2.getNum() - o1.getNum();
            }
        });
    }
}
