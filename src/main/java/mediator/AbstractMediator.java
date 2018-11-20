package mediator;

/**
 * Created by Administrator on 2018/11/20 0020.
 */
public abstract class AbstractMediator {
    protected Purchase purchase;
    protected Stock stock;
    protected Sale sale;

    public AbstractMediator() {
        purchase = new Purchase(this);
        stock = new Stock(this);
        sale = new Sale(this);
    }

    //处理多个对象之间的关系
    public abstract void execute(String str, Object... objects);
}
