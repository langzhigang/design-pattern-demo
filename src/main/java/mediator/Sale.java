package mediator;

import java.util.Random;

/**
 * Created by Administrator on 2018/11/20 0020.
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    //销售电脑
    public void sell(int number) {
        super.mediator.execute("sale.sell", number);
        System.out.println("销售电脑:" + number + "台");
    }

    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(200);
        System.out.println("当前电脑销售情况:" + saleStatus);
        return saleStatus;
    }

    //打折处理
    public void offSale() {
        super.mediator.execute("sale.offsell");
    }
}
