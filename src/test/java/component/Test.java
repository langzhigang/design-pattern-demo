package component;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        //创建一个根节点
        Composite root = new Composite();

        //创建一个树枝节点
        Composite branch = new Composite();
        root.add(branch);

        //创建一个叶子节点
        Leaf leaf = new Leaf();
        branch.add(leaf);

        display(root);
    }

    //通过递归遍历树
    public static void display(Composite root){
        ArrayList<Component> componentList = root.getChildren();
        for (Component component : componentList) {
            if(component instanceof Leaf){
                component.doSomething();
            }else {
                display((Composite) component);
            }
        }
    }
}
