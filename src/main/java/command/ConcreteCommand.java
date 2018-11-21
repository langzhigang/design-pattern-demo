package command;

/**
 * Created by Administrator on 2018/11/21 0021.
 */
public class ConcreteCommand extends Command{
    public ConcreteCommand() {
        super(new ConcreteReceiver());
    }

    @Override
    public void execute() {
        super.receiver.doSomething();
    }
}
