package adapter;

public class ConcreteTarget implements Target{
    @Override
    public void method() {
        System.out.println("ConcreteTarget method");
    }
}
