package demo;

public class silvercard extends card {
    public silvercard(String carid, String name, String phone, double money) {
        super(carid, name, phone, money);
    }
    @Override
    public void consume(double money) {
        System.out.println("您当前消费："+ money);
        System.out.println("优惠后价格："+ money*0.9);
        if(money*0.8>getMoney()){
            System.out.println("余额不足");
            return;
        }
        setMoney(getMoney()-money*0.8);
    }
}
