package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 */
public abstract class Subject {

    List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void delObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    public void notifyObserver(){
        for (Observer observer : this.observerList) {
            observer.update();
        }
    }
}
