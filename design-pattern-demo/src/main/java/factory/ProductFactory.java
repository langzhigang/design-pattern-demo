package factory;

/**
 * Created by Administrator on 2018/11/12 0012.
 */
public class ProductFactory {
    public static <T extends Product> T createProduct(Class<T> productClazz) {
        T t = null;
        try {
            t = productClazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }
}
