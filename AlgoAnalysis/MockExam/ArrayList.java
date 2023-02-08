package AlgoAnalysis.MockExam;

public class ArraySet<T> implements SetInterface<T> {
  private ArrayList<T> arrayList;

  public ArraySet() {
    arrayList = new ArrayList<>();
  }

  public int getCurrentSize() {
    return arrayList.size();
  }

  public boolean isEmpty() {
    return arrayList.isEmpty();
  }

  public boolean add(T newEntry) {
    if (contains(newEntry)) {
      return false;
    }
    arrayList.add(newEntry);
    return true;
  }

  public boolean remove(T anEntry) {
    return arrayList.remove(anEntry);
  }

  public void clear() {
    arrayList.clear();
  }

  public boolean contains(T anEntry) {
    return arrayList.contains(anEntry);
  }

  public T[] toArray() {
    return (T[]) arrayList.toArray();
  }
}
