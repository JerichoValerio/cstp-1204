public class ListUsingALinkedList {

  Node front;
  int numberOfElements;

  ListUsingALinkedList() {
    front = null;
    numberOfElements = 0;
  }

  void add(int element) {
    add(numberOfElements + 1, element);
  }

  Node getNode(int position) {
    if (position > numberOfElements)
      return null;

    Node tmp = front;
    if (front != null) {
      int counter = 1;
      while (counter < position) {

        tmp = tmp.next;
        counter++;
      }
    }
    return tmp;
  }

  void add(int position, int element) {
    Node aNewNode = new Node();
    aNewNode.data = element;
    if (position > 1) {

      Node prevNode = getNode(position - 1);

      // 1
      aNewNode.next = prevNode.next;

      // 2
      prevNode.next = aNewNode;
      numberOfElements++;
    } else if (position == 1) {
      // position is 1
      aNewNode.next = front;
      front = aNewNode;
      numberOfElements++;
    } else {
      System.out.println("You should not use position < 1 ");
    }
  }

  void remove(int position) {
    if (position > 1) {
      Node prevNode = getNode(position - 1);
      Node tmp = prevNode.next;
      // 1
      prevNode.next = prevNode.next.next;
      // 2
      tmp.next = null;
      numberOfElements--;
    } else if (position == 1) {
      Node tmp = front;

      front = front.next;

      tmp.next = null;
      numberOfElements--;
    } else {
      System.out.println("You should not use position < 1 ");
    }
  }

  int get(int position) {
    if (position >= 1)
      return getNode(position).data;
    else
      return -1;
  }

  int size() {
    return numberOfElements;
  }

  public static void main(String[] args) {
    ListUsingALinkedList x = new ListUsingALinkedList();
    // Position starts from 1
    x.add(10);
    x.add(20);
    x.add(30);
    System.out.println(x.get(3));// 30
    x.add(1, 5);
    System.out.println(x.get(3));// 20
    x.remove(3); 
    System.out.println(x.size());// 3
  }

}