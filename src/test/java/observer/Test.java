package observer;

public class Test {
    public static void main(String[] args){

        Observer observer = new ConcreteObserver();

        ConcreteSubject subject = new ConcreteSubject();

        subject.addObserver(observer);

        subject.doSomething();
    }
}
