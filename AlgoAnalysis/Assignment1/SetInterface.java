package AlgoAnalysis.Assignment1;

public interface SetInterface<T> {

  public boolean add(T newEntry);

  public boolean remove(T anEntry);

  public boolean isEmpty();

  public void clear();

  public int getCurrentSize();

  public boolean contains(T anEntry);

  public T[] toArray();

}
