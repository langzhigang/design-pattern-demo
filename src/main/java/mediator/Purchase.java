package mediator;

/**
 * Created by Administrator on 2018/11/20 0020.
 */
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyComputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseButComputer() {
        System.out.println("拒绝购买电脑");
    }
}
