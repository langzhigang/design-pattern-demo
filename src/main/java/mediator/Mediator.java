package mediator;

/**
 * Created by Administrator on 2018/11/20 0020.
 */
public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {//采购电脑
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {//销售电脑
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {//打折销售
            this.offSell();
        } else if (str.equals("stock.clear")) {//清仓处理
            this.clearStock();
        }
    }

    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("销售状态良好，采购电脑" + number + "台");
            super.stock.increase(number);
        } else {
            number = number / 2;
            System.out.println("销售状态不好，采购电脑" + number + "台");
            super.stock.increase(number);
        }
    }

    //销售电脑
    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) {  //库存数量不够销售
            super.purchase.buyComputer(number);
        }
        super.stock.decrease(number);
    }

    //打折处理
    private void offSell() {
        System.out.println("打折销售电脑" + super.stock.getStockNumber() + "台");
    }

    //清仓处理
    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseButComputer();
    }
}
