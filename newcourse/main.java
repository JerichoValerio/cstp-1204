package newcourse;

class Main {
  public static void main(String[] args) {
    // StackUsingArray aStack = new StackUsingArray();
    // StackUsingArray anotherStack = new StackUsingArray();
    StackUsingLinkedList aStack = new StackUsingLinkedList();
    aStack.push(1);
    aStack.push(2);

    // Test Case 1 - test the push and the peek
    System.out.println(aStack.peek()); // 2 Expected

    // Test Case 2 - test the pop
    aStack.pop(); // 2 should be removed
    System.out.println(aStack.peek()); // 1 Expected

    // Test Case 3 - test an empty stack
    // aStack.pop();
    aStack.pop();
    System.out.println(aStack.peek()); // Expected -266

  }

}
