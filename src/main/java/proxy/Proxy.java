package proxy;

/**
 * Created by Administrator on 2018/11/18 0018.
 */
public class Proxy implements Subject{
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void doSomething() {
        System.out.println("Proxy doSomething before");
        realSubject.doSomething();
        System.out.println("Proxy doSomething after");
    }
}
