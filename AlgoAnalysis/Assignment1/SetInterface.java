package AlgoAnalysis.Assignment1;

public interface SetInterface<T> {

  boolean add(T newEntry);

  boolean remove(T anEntry);

  boolean isEmpty();

  void clear();

  int getCurrentSize();

  boolean contains(T anEntry);

  T[] toArray();

}
