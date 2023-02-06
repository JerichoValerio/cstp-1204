package AlgoAnalysis.LinearSearch;

// todo First Implementation of linearSearch and binarySearch
public class LinearSearchJavaFirst {
  public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int target = 7;
    int linearIndex = linearSearch(arr, target);
    int binaryIndex = binarySearch(arr, target);

    System.out.println("Linear search index: " + linearIndex);
    System.out.println("Binary search index: " + binaryIndex);
  }
}
