package factory;

/**
 * Created by Administrator on 2018/11/12 0012.
 */
public class ProductA implements Product{
    public void showName() {
        System.out.println(this.getClass().getName());
    }
}
