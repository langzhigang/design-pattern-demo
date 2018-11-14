package template_method;

/**
 * Created by Administrator on 2018/11/14 0014.
 */
public abstract class AbstractCar {
    protected abstract void start();
    protected abstract void run();
    protected abstract void alarm();
    protected abstract void stop();

    /**
     * 客户买车前要测试车辆性能
     */
    protected void testCar(){
        start();
        run();
        alarm();
        stop();
    }
}
