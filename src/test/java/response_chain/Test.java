package response_chain;

/**
 * Created by Administrator on 2018/11/22 0022.
 */
public class Test {
    public static void main(String[] args){
        Handler c1 = new Concrete1Handler();
        Handler c2 = new Concrete2Handler();

        c1.setNextHandler(c2);

        c1.handler(new Request());
    }
}
