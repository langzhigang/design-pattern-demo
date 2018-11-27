package strategy;

public class Test {
    public static void main(String[] args){
        Context context = new Context(new ConcreteStrategy1());
        context.execute();
    }
}
