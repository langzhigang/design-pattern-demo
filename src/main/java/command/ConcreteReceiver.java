package command;

/**
 * Created by Administrator on 2018/11/21 0021.
 */
public class ConcreteReceiver extends Receiver{
    @Override
    public void doSomething() {
        System.out.println("ConcreteReceiver do something");
    }
}
