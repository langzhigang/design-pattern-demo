package template_method;

/**
 * Created by Administrator on 2018/11/14 0014.
 */
public class Test {
    public static void main(String[] args){
        AbstractCar bmwCar = new BMWCar();
        AbstractCar benZCar = new BenZCar();

        bmwCar.testCar();
        benZCar.testCar();
    }
}
