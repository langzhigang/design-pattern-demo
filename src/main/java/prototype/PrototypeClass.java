package prototype;

/**
 * Created by Administrator on 2018/11/19 0019.
 */
public class PrototypeClass implements Cloneable {
    public PrototypeClass() {
        System.out.println("PrototypeClass 构造函数");
    }

    @Override
    protected PrototypeClass clone() {
        PrototypeClass clone = null;
        try {
            clone = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
