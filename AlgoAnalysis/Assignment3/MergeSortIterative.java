package AlgoAnalysis.Assignment3;

public class MergeSortIterative {

  public static void merge(int[] arr, int l, int m, int r) {

      int n1 = m - l + 1;
      int n2 = r - m;

      int[] L = new int[n1];
      int[] R = new int[n2];

      for (int i = 0; i < n1; ++i)
          L[i] = arr[l + i];
      for (int j = 0; j < n2; ++j)
          R[j] = arr[m + 1 + j];

      int i = 0, j = 0;

      int k = l;
      while (i < n1 && j < n2) {
          if (L[i] <= R[j]) {
              arr[k] = L[i];
              i++;
          } else {
              arr[k] = R[j];
              j++;
          }
          k++;
      }

      while (i < n1) {
          arr[k] = L[i];
          i++;
          k++;
      }

      while (j < n2) {
          arr[k] = R[j];
          j++;
          k++;
      }
  }

  public static void mergeSort(int[] arr) {
      int n = arr.length;

      int curr_size;
      int left_start;

      for (curr_size = 1; curr_size <= n - 1; curr_size = 2 * curr_size) {
          for (left_start = 0; left_start < n - 1; left_start += 2 * curr_size) {
              int mid = Math.min(left_start + curr_size - 1, n - 1);
              int right_end = Math.min(left_start + 2 * curr_size - 1, n - 1);
              merge(arr, left_start, mid, right_end);
          }
      }
  }

  public static void main(String[] args) {
      int[] arr = { 12, 11, 13, 5, 6, 7 };
      System.out.println("Array before sorting:");
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
      System.out.println();
      mergeSort(arr);
      System.out.println("Array after sorting:");
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
  }
}
