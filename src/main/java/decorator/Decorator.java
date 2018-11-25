package decorator;

/**
 * Created by Administrator on 2018/11/25 0025.
 */
public abstract class Decorator extends Component{
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
