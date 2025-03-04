package innerclass3;

public class test2 {
    public static void main(String[] args) {
        Swim s1 = new Teacher();
        start(s1);

        Swim s2 = new Swim(){
          @Override
          public void swimming(){
              System.out.println("swimming");
          }
        };
        start(s2);

        start(new Swim(){
            @Override
            public void swimming(){
                System.out.println("swimming1");
            }
        });
    }
    public static void start(Swim s){
        System.out.println("start");
        s.swimming();
        System.out.println("end");
    }
}

class Teacher implements Swim{
    public void swimming(){
        System.out.println("teacher swimming");
    }
}

class Student implements Swim{
    public void swimming(){
        System.out.println("student swimming");
    }

}

interface Swim{
    void swimming();
}
