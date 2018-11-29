package iterator;

/**
 * 自定义抽象集合类
 */
public interface MyCollection<E> {
    void add(E t);

    boolean remove(E t);

    MyIterator<E> iterator();
}
