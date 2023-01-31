package AlgoAnalysis.Assignment1;

public class SetLL<T> implements SetInterface<T> {
  Node<T> head;
  Node<T> tail;
  int size;

  
  public SetLL() {
    head = null;
    tail = null;
    size = 0;
  }

  public int getCurrentSize() {
    return size;
  }

  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    return false;
  }

  public boolean add(T newEntry) {
    if (contains(newEntry)) {
      return false;
    }
    Node<T> newNode = new Node<T>();
    newNode.data = newEntry;
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    size++;
    return true;
  }

  public boolean remove(T anEntry) {
    Node<T> current = head;
    Node<T> previous = null;
    while (current != null) {
      if (current.data == anEntry) {
        if (previous == null) {
          head = current.next;
        } else {
          previous.next = current.next;
        }
        size--;
        return true;
      }
      previous = current;
      current = current.next;
    }
    return false;
  }

  public void clear() {
    head = null;
    tail = null;
    size = 0;
  }

  public boolean contains(T anEntry) {
    Node<T> current = head;
    while (current != null) {
      if (current.data == anEntry) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public T[] toArray() {
    T[] array = (T[]) new Object[size];
    Node<T> current = head;
    int i = 0;
    while (current != null) {
      array[i] = current.data;
      current = current.next;
      i++;
    }
    return array;
  }
}