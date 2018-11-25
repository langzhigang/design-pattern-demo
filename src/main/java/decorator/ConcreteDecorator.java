package decorator;

/**
 * Created by Administrator on 2018/11/25 0025.
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
    }

    //定义自己的修饰方式
    private void method1(){
        System.out.println("method1 修饰");
    }
}
