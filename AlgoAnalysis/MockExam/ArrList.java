package AlgoAnalysis.MockExam;

import java.util.ArrayList;

public class ArrList<T> implements SetInterface<T> {
  private ArrayList<T> arrayList;
  private int capacity;
  private int size;

  public ArrList() {
    capacity = 1;
    size = 0;
    arrayList = new ArrayList<>(capacity);
  }

  public int getCurrentSize() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean add(T newEntry) {
    if (contains(newEntry)) {
      return false;
    }
    if (size == capacity) {
      resize();
    }
    arrayList.add(newEntry);
    size++;
    return true;
  }

  public boolean remove(T anEntry) {
    boolean success = arrayList.remove(anEntry);
    if (success) {
      size--;
    }
    return success;
  }

  public void clear() {
    arrayList.clear();
    size = 0;
  }

  public boolean contains(T anEntry) {
    return arrayList.contains(anEntry);
  }

  public T[] toArray() {
    return (T[]) arrayList.toArray();
  }


  private void resize() {
    capacity *= 2;
    ArrayList<T> newArrayList = new ArrayList<>(capacity);
    for (T element : arrayList) {
      newArrayList.add(element);
    }
    arrayList = newArrayList;
  }
}