package iterator;

public class Test {
    public static void main(String[] args) {
        ConcreteMyCollection<String> myCollection = new ConcreteMyCollection<>();
        myCollection.add("a");
        myCollection.add("b");
        myCollection.add("c");

        MyIterator<String> iterator = myCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
