package demo1exception;

public class AgeIlleageRuntimeExpection extends RuntimeException {
    public AgeIlleageRuntimeExpection() {
    }

    public AgeIlleageRuntimeExpection(String message) {
        super(message);
    }

}
