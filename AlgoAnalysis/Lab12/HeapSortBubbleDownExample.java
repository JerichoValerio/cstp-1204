package AlgoAnalysis.Lab12;

public class HeapSortBubbleDownExample {

  public static void main(String[] args) {
    int[] arr = { 12, 11, 13, 5, 6, 7 };

    System.out.println("Input array:");
    printArray(arr);

    heapSort(arr);

    System.out.println("Output array:");
    printArray(arr);
  }

  public static void heapSort(int[] arr) {
    int n = arr.length;

    // Build max heap
    for (int i = n / 2 - 1; i >= 0; i--)
      bubbleDown(arr, n, i);

    // Extract elements from the heap in sorted order
    for (int i = n - 1; i >= 0; i--) {
      // Move the root (maximum element) to the end of the array
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;

      // Fix the heap property by performing bubble-down on the root
      bubbleDown(arr, i, 0);
    }
  }

  private static void bubbleDown(int[] arr, int n, int i) {
    int largest = i; // Initialize largest as root
    int l = 2 * i + 1; // Left child
    int r = 2 * i + 2; // Right child

    // If left child is larger than root
    if (l < n && arr[l] > arr[largest])
      largest = l;

    // If right child is larger than largest so far
    if (r < n && arr[r] > arr[largest])
      largest = r;

    // If largest is not root
    if (largest != i) {
      // Swap arr[i] with arr[largest]
      int temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;

      // Recursively bubble-down the affected sub-tree
      bubbleDown(arr, n, largest);
    }
  }

  private static void printArray(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1)
        System.out.print(", ");
    }
    System.out.println("]");
  }
}
