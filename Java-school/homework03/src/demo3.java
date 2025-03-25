/**
 * 23030433
 * 赵新航
 * 输入一个日期，输出星期几
 */
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入日期 (格式为 yyyy-MM-dd)：");
        String inputDate = scanner.nextLine();
        if (!inputDate.matches("\\d{4}-\\d{2}-\\d{2}")) {
            System.out.println("输入的日期格式不正确");
            return;
        }
        LocalDate date = LocalDate.parse(inputDate);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        switch(dayOfWeek){
            case MONDAY:
                System.out.println("星期一");
                break;
            case TUESDAY:
                System.out.println("星期二");
                break;
            case WEDNESDAY:
                System.out.println("星期三");
                break;
            case THURSDAY:
                System.out.println("星期四");
                break;
            case FRIDAY:
                System.out.println("星期五");
                break;
            case SATURDAY:
                System.out.println("星期六");
                break;
            case SUNDAY:
                System.out.println("星期日");
                break;
            default:
                System.out.println("未知的星期");
                break;
        }
    }
}

