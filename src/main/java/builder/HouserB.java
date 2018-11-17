package builder;

/**
 * Created by Administrator on 2018/11/17 0017.
 */
public class HouserB extends House {
    protected void decorateKitchen() {
        System.out.println("HouserB 装修厨房");
    }

    protected void decorateLivingRoom() {
        System.out.println("HouserB 装修客厅");
    }

    protected void decorateBedroom() {
        System.out.println("HouserB 装修卧室");
    }

    protected void decorateBalcony() {
        System.out.println("HouserB 装修阳台");
    }
}
