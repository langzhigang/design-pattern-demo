package component;

public abstract class Component {
    //个体和整体都具有的共享方法
    public void doSomething(){
        System.out.println( "Component doSomething");
    }
}
