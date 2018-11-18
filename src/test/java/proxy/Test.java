package proxy;

/**
 * Created by Administrator on 2018/11/18 0018.
 */
public class Test {
    public static void main(String[] args){
        new Proxy(new RealSubject()).doSomething();
    }
}
