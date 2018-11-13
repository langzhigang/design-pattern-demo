package abstract_factory;

/**
 * Created by Administrator on 2018/11/13 0013.
 */
public class LinuxTextFactory implements TextFactory{
    public Text createText() {
        return new LinuxText();
    }
}
