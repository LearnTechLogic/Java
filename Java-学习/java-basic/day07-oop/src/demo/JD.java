package demo;


public class JD implements Switch{
    private String name;
    private boolean status;

    public JD(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public void press() {
        status = !status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
