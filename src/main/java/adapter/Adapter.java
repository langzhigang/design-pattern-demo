package adapter;

public class Adapter extends Adaptee {
    private Target target;

    public Adapter(Target target) {
        this.target = target;
    }

    public void method() {
        this.target.method();
    }

}
