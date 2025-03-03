package enumdemo;

public class test2 {
    public static void main(String[] args) {
        move1(constant.up);
        move2(direction.left);

    }
    public static void move1(int direction){
        switch (direction){
            case constant.up:
                System.out.println("向上移动");
                break;
            case constant.down:
                System.out.println("向下移动");
                break;
            case constant.left:
                System.out.println("向左移动");
                break;
            case constant.right:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效指令");
                break;
       }

    }


    public static void move2(direction direct){
        switch (direct){
            case direction.up:
                System.out.println("向上移动");
                break;
            case direction.down:
                System.out.println("向下移动");
                break;
            case direction.left:
                System.out.println("向左移动");
                break;
            case direction.right:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效指令");
                break;
        }

    }
}
