package template_method;

/**
 * Created by Administrator on 2018/11/14 0014.
 */
public class BMWCar extends AbstractCar{
    protected void start() {
        System.out.println("BMW 启动");
    }

    protected void run() {
        System.out.println("BMW 行驶");
    }

    protected void alarm() {
        System.out.println("BMW 鸣喇叭");
    }

    protected void stop() {
        System.out.println("BMW 停车");
    }
}
