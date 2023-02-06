package AlgoAnalysis.LinearSearch;

public class LinearSearchJavaSecond {
  public static int linearSearch(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static int binarySearch(int[] array, int target) {
    int start = 0;
    int end = array.length - 1;
    while (start <= end) {
      int middle = (start + end) / 2;
      if (array[middle] == target) {
        return middle;
      } else if (array[middle] < target) {
        start = middle + 1;
      } else {
        end = middle - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int target = 14;
    int linearIndex = linearSearch(array, target);
    int binaryIndex = binarySearch(array, target);

    System.out.println("Second Implementation of Linear search index: " + linearIndex);
    System.out.println("Second Implementation of Binary search index: " + binaryIndex);
  }
}
