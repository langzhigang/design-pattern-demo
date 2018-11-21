package command;

/**
 * Created by Administrator on 2018/11/21 0021.
 */
public class Invoker {
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }
}
