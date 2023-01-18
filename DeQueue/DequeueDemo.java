package DeQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;


public class DequeueDemo {
  public static void main(String[] args) {
    
    Queue<Integer> aQueue = new LinkedList<>();
    aQueue.add(1);
    aQueue.add(2);
    aQueue.remove(); //removed 1
    System.out.println(aQueue.peek()); //2


    Deque<Integer> aDequeue = new ArrayDeque();
    aDequeue.addFirst(1);
    aDequeue.addFirst(2);
    System.out.println(aDequeue.getLast()); //1
    aDequeue.addLast(3);
    System.out.println(aDequeue.getFirst()); //2
  }

}
