package missed;

import java.util.LinkedHashSet;
import java.util.Stack;



// 5 - Write a function displayArrayFromMiddle(int[] array, int firstIndex, int lastIndex) that displays the integers in an array starting from the middle element and then the middle of the left or the right part of the array using
// -- Iterative approach (only loops)
// -- Recursive approach (the function call itself)

// You may go left or right part of the array or visa versa after that.
class Record {
  int firstIndex;
  int lastIndex;

  public Record(int a, int b) {
    firstIndex = a;
    lastIndex = b;
  }
}

public class q5 {

  static void displayArrayFromMiddle_i(int[] array, int firstIndex, int lastIndex) {
    Stack<Record> aStack = new Stack<Record>();
    aStack.add(new Record(firstIndex, lastIndex));

    while (!aStack.empty()) {
      Record topRecord = aStack.pop();
      int first = topRecord.firstIndex;
      int last = topRecord.lastIndex;
      if (first <= last) {
        int mid = (first + last) / 2;
        System.out.println(array[mid]);
        aStack.push(new Record(mid + 1, last));
        aStack.push(new Record(first, mid - 1));
      }
    }
  }

  static void displayArrayFromMiddle_r(int[] array, int firstIndex, int lastIndex) {
    if (firstIndex <= lastIndex) {
      int mid = (firstIndex + lastIndex) / 2;
      System.out.println(array[mid]);
      displayArrayFromMiddle_r(array, firstIndex, mid - 1);
      displayArrayFromMiddle_r(array, mid + 1, lastIndex);
    }
  }

  public static void main(String[] args) {
    int[] array = { 1, 12, 2, 3, 4, 45, 5 };

    displayArrayFromMiddle_i(array, 0, 6); // 3, 12, 1, 2, 45, 4, 5
  }

}
