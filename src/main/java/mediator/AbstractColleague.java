package mediator;

/**
 * Created by Administrator on 2018/11/20 0020.
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator abstractMediator) {
        this.mediator = abstractMediator;
    }
}
