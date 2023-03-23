package AlgoAnalysis.Assignment3;

public class QuickSort {
  public void sort(int[] arr) {
    quicksort(arr, 0, arr.length - 1);
  }

  void quicksort(int[] arr, int low, int high) {
    if (low < high) {
      int pivotIndex = partition(arr, low, high);
      quicksort(arr, low, pivotIndex - 1);
      quicksort(arr, pivotIndex + 1, high);
    }
  }

  int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1; // Index of smaller element
    for (int j = low; j < high; j++) {
      // If current element is smaller than or equal to pivot
      if (arr[j] <= pivot) {
        i++;
        // Swap arr[i] and arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    // Swap arr[i+1] and arr[high] (or pivot)
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
  }
}
