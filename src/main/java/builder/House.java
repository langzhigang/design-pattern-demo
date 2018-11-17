package builder;

/**
 * Created by Administrator on 2018/11/17 0017.
 */
public abstract class House {
    /**
     * 装修厨房
     */
    protected abstract void decorateKitchen();

    /**
     * 装修客厅
     */
    protected abstract void decorateLivingRoom();

    /**
     * 装修卧室
     */
    protected abstract void decorateBedroom();

    /**
     * 装修阳台
     */
    protected abstract void decorateBalcony();
}
