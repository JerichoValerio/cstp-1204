package AlgoAnalysis.Assignment3;

public class QuickSort {

  public static int partition(int[] arr, int low, int high) {
      int pivot = arr[high];
      int i = (low - 1);

      for (int j = low; j < high; j++) {
          if (arr[j] < pivot) {
              i++;
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
          }
      }

      int temp = arr[i + 1];
      arr[i + 1] = arr[high];
      arr[high] = temp;

      return i + 1;
  }

  public static void quickSort(int[] arr, int low, int high) {
      if (low < high) {
          int pi = partition(arr, low, high);
          quickSort(arr, low, pi - 1);
          quickSort(arr, pi + 1, high);
      }
  }

  public static void main(String[] args) {
      int[] arr = { 12, 11, 13, 5, 6, 7 };
      System.out.println("Array before sorting:");
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println();
      quickSort(arr, 0, arr.length - 1);
      System.out.println("Array after sorting:");
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
  }
}

