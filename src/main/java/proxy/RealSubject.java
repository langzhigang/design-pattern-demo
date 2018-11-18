package proxy;

/**
 * Created by Administrator on 2018/11/18 0018.
 */
public class RealSubject implements Subject{
    @Override
    public void doSomething() {
        System.out.println("RealSubject doSomething");
    }
}
