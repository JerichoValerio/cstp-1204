package newcourse;

public class StackUsingLinkedList {

  Node head;

  StackUsingLinkedList() {
    head = null;
  }

  void push(int anElement) {
    Node newNode = new Node();
    newNode.data = anElement;

    newNode.next = head;

    head = newNode;
  }

  void pop() {
    head = head.next;
  }

  int peek() {
    if (head == null)
      return -266;
    else
      return head.data;
  }

}