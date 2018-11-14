package template_method;

/**
 * Created by Administrator on 2018/11/14 0014.
 */
public class BenZCar extends AbstractCar{
    protected void start() {
        System.out.println("BenZ 启动");
    }

    protected void run() {
        System.out.println("BenZ 行驶");
    }

    protected void alarm() {
        System.out.println("BenZ 鸣喇叭");
    }

    protected void stop() {
        System.out.println("BenZ 停车");
    }
}
