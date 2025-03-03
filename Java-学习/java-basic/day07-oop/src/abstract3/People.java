package abstract3;

public abstract class People {
    public final void write()
    {
        System.out.println("writing");
        writemain();
        System.out.println("333333");
    }

    public abstract void writemain();
}
