package behavioral.iterator;

public interface Aggregate<E> {
	Iterator<E> createIterator();
}
