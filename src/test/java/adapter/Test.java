package adapter;

public class Test {
    public static void main(String[] args){
        Adapter adapter = new Adapter(new ConcreteTarget());
        adapter.method();
        adapter.doSomething();
    }
}
