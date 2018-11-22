package response_chain;

/**
 * Created by Administrator on 2018/11/22 0022.
 */
public class Concrete1Handler extends Handler{
    @Override
    protected Response execute(Request request) {
        System.out.println("Concrete1Handler execute");
        return new Response();
    }
}
