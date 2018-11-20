package mediator;

/**
 * Created by Administrator on 2018/11/20 0020.
 */
public class Test {
    public static void main(String[] args){
        AbstractMediator mediator = new Mediator();

        System.out.println("采购人员采购电脑");

        Purchase purchase = new Purchase(mediator);
        purchase.buyComputer(100);

        System.out.println("销售人员销售电脑");

        Sale sale = new Sale(mediator);
        sale.sell(1);

        System.out.println("库存管理人员管理库存");

        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
