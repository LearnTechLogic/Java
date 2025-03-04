package interface2;

import interface4.A;

public class test {
    public static void main(String[] args) {
        Aimpl a = new Aimpl();
        a.go();

        A.show();
    }
}

class Aimpl implements A {

}
