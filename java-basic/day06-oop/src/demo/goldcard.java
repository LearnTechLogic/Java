package demo;

public class goldcard extends card {
    public goldcard(String carid, String name, String phone, double money) {
        super(carid, name, phone, money);
    }
    @Override
    public void consume(double money) {
        System.out.println("您当前消费："+ money);
        System.out.println("优惠后价格："+ money*0.8);
        if (getMoney()<money*0.8){
            System.out.println("余额不足");
            return;
        }
        setMoney(getMoney()-money*0.8);
        if (money*0.8>=200){
            printTicket();
        }else {
            System.out.println("您消费没有200，没有洗车券");
        }
    }

    //打印洗车票
    public void printTicket(){
        System.out.println("打印洗车卷");
    }
}
