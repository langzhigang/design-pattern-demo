package command;

/**
 * Created by Administrator on 2018/11/21 0021.
 */
public class Test {
    public static void main(String[] args){
        Invoker invoker = new Invoker();
        invoker.setCommand(new ConcreteCommand());
        invoker.action();
    }
}
