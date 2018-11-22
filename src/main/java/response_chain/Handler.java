package response_chain;

/**
 * Created by Administrator on 2018/11/22 0022.
 */
public abstract class Handler {
    private Handler nextHandler;

    public final Response handler(Request request){
        Response response;
        if(this.nextHandler != null){
            response = nextHandler.handler(request);
        }else {
            response = this.execute(request);
        }
        return response;
    }

    protected abstract Response execute(Request request);

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
