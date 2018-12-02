package component;

import java.util.ArrayList;

public class Composite extends Component{
    //构建容器
    private ArrayList<Component> componentList = new ArrayList<>();

    //增加一个叶子构件或树枝构件
    public void add(Component component){
        this.componentList.add(component);
    }

    //删除一个叶子构件或树枝构件
    public void remove(Component component){
        this.componentList.remove(component);
    }

    public ArrayList<Component> getChildren(){
        return this.componentList;
    }
}
