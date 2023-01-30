package QueueUsingCircularLinkedList;

public class Queue {

  Node back;

  Queue() {
    back = null;
  }

  void insert(int inputInteger) {
    Node aNewNode = new Node();
    aNewNode.data = inputInteger;

    if (back == null) {
      // the first node to be added to your circular LinkedList
      back = aNewNode;
      Node tmp = back;
      back.next = tmp;
    } else { // if we have one node or more
      Node front = back.next;

      back.next = aNewNode; // 1
      aNewNode.next = front;// 2
      back = aNewNode;// 3
    }
  }

  void remove() {
    // if we have many node
    if (back.next != back) {
      Node destinationNode = back.next.next;
      back.next = destinationNode;
    } else {
      // if we have one node or if queue was empty
      back = null;
    }

  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.insert(6);
    q.insert(4);
    q.insert(7);
    q.insert(3);
    q.insert(8);
    q.remove();// front to 1
    q.remove();// front to 2
    q.insert(9);
    q.insert(5);
    System.out.println(q.getFront());// 7
    q.contains(10);// false
    q.isEmpty();// false
    q.size(); // 5
    q.printAll();// start from front

  }

}