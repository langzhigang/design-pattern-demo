package factory;

/**
 * Created by Administrator on 2018/11/12 0012.
 */
public class Test {
    public static void main(String[] args){
        ProductA productA = ProductFactory.createProduct(ProductA.class);
        productA.showName();
        ProductB productB = ProductFactory.createProduct(ProductB.class);
        productB.showName();
    }
}
