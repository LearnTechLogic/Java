package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class card {
    private String carid;
    private String name;
    private String phone;
    private double money;

    //预存金额
    public void deposit(double money){
        this.money += money;
    }

    //消费金额
    public void consume(double money){
        if(this.money >= money){
            this.money -= money;
        }else{
            System.out.println("余额不足");
        }
    }
}
