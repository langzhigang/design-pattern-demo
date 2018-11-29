package iterator;

import java.util.List;

public class MyConcreteIterator<T> implements MyIterator<T> {

    private List<T> list;

    private int index = 0;

    public MyConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size()) {
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            return list.get(index++);
        }
        return null;
    }

}
