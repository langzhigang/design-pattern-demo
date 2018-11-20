package mediator;

/**
 * Created by Administrator on 2018/11/20 0020.
 */
public class Stock extends AbstractColleague {

    //刚开始库存有100
    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    //增加库存
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("增加库存数量为：" + COMPUTER_NUMBER);
    }

    //减少库存
    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("减少库存数量为：" + COMPUTER_NUMBER);
    }

    //获得库存数量
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    //清空库存
    public void clearStock() {
        System.out.println("清理库存数量为：" + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
