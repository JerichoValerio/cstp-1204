package chapter8;

public class Queue {

  Node front;

  Queue() {
    front = null;
  }

  void enqueue(int input) {
    Node aNewNode = new Node();
    aNewNode.data = input;

    if (front == null)
      front = aNewNode;
    else {
      // the queue is not empty
      Node tmp = front;
      while (tmp != null) {
        if (tmp.next == null) {
          break;
        }
        tmp = tmp.next;
      }

      tmp.next = aNewNode;
    }
  }

  void dequeue() {
    if (front == null) {
      return;
  }
      front = front.next;
  }


  int getFront() {
    if (front == null) {
      return -1;
    }
    return front.data;
  }

  int getSize() {
    int size = 0;
    Node tmp = front;
    while (tmp != null) {
      size++;
      tmp = tmp.next;
    }
    return size;
  }

  boolean isEmpty() {
    return front == null;
  }


  boolean contains(int input) {
    Node tmp = front;
    while (tmp != null) {
      if (tmp.data == input) {
        return true;
      }
      tmp = tmp.next;
    }
    return false;
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.enqueue(1); // add 1 to the back of queue
    q.enqueue(2);
    q.enqueue(3);
    q.dequeue(); // remove 1
    q.dequeue(); // remove 2
    q.getFront(); // 3
    q.getSize(); // 1
    q.isEmpty(); // false
    q.contains(1); // false
  }
}
