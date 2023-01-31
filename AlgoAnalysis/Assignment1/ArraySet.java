package AlgoAnalysis.Assignment1;


//T is whatever user wants to use
public class ArraySet<T> implements SetInterface<T> {
  public T[]arrayGlobal;

  public ArraySet() {
    arrayGlobal = (T[]) new Object[10];
  }

  public int getCurrentSize() {
    int count = 0;
    for (int i = 0; i < arrayGlobal.length; i++) {
      if (arrayGlobal[i] != null) {
        count++;
      }
    }
    return count;
  }

  public boolean isEmpty() {
    if (getCurrentSize() == 0) {
      return true;
    }
    return false;
  }

  public boolean add(T newEntry) {
    if (contains(newEntry)) {
      return false;
    }
    for (int i = 0; i < arrayGlobal.length; i++) {
      if (arrayGlobal[i] == null) {
        arrayGlobal[i] = newEntry;
        return true;
      }
    }
    return false;
  }

  //removes 1 element
  public boolean remove(T anEntry) {
    for (int i = 0; i < arrayGlobal.length; i++) {
      if (arrayGlobal[i] == anEntry) {
        arrayGlobal[i] = null;
        return true;
      }
    }
    return false;
  }

  //removes all elements
  public void clear() {
    for (int i = 0; i < arrayGlobal.length; i++) {
      arrayGlobal[i] = null;
    }
  }

  public boolean contains(T anEntry) {
    for (int i = 0; i < arrayGlobal.length; i++) {
      if (arrayGlobal[i] == anEntry) {
        return true;
      }
    }
    return false;
  }

  
  public T[] toArray() {
    return arrayGlobal;
  }
  
}

