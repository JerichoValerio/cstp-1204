package AlgoAnalysis.MockExam;

public class Node <T> {
  T data;
  Node <T> next;

  Node() {
    data = null;
    //next means it takes whatever data type of <T> is
    next = null;
  }
}
