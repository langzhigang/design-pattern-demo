package decorator;

/**
 * Created by Administrator on 2018/11/25 0025.
 */
public class ConcreteComponent extends Component{

    @Override
    public void operate() {
        System.out.println("ConcreteComponent 都something");
    }
}
