package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMyCollection<E> implements MyCollection<E> {

    private List<E> list = new ArrayList<>();

    @Override
    public void add(E t) {
        list.add(t);
    }

    @Override
    public boolean remove(E t) {
        return list.remove(t);
    }

    @Override
    public MyIterator<E> iterator() {
        return new MyConcreteIterator<>(list);
    }
}
