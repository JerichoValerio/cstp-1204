package AlgoAnalysis.Assignment1;

import java.util.LinkedList;

public class SetLL<T> implements SetInterface<T> {
  private LinkedList<T> list;

  public SetLL() {
    list = new LinkedList<T>();
  }

  public int getCurrentSize() {
    return list.size();
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public boolean add(T newEntry) {
    if (!list.contains(newEntry)) {
      list.add(newEntry);
      return true;
    }
    return false;
  }

  public boolean remove(T anEntry) {
    return list.remove(anEntry);
  }

  public void clear() {
    list.clear();
  }

  public boolean contains(T anEntry) {
    return list.contains(anEntry);
  }

  @SuppressWarnings("unchecked")
  public T[] toArray() {
    return (T[]) list.toArray();
  }

  @Override
  public void add(int i) {
    // TODO Auto-generated method stub

    
    
  }

  @Override
  public boolean remove(int i) {
    // TODO Auto-generated method stub
    return false;
  }
}