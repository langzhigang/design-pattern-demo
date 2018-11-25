package decorator;

/**
 * Created by Administrator on 2018/11/25 0025.
 */
public class Test {
    public static void main(String[] args){
        Component component = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(component);
        decorator.operate();
    }
}
