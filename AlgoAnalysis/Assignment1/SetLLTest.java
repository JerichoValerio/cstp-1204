package AlgoAnalysis.Assignment1;
import org.junit.Test;
import static org.junit.Assert.*;

public class SetLLTest {
  @Test
  public void SetInterfaceUsingLLTest1() {
    SetLL<Integer> set = new SetLL<Integer>();

    // This is before we put anything into the set //initialize
    assertEquals(0, set.getCurrentSize());
    assertTrue(set.isEmpty());
    assertFalse(set.remove(5));
  }

  @Test
  public void SetInterfaceUsingLLTest2() {
    SetLL<Integer> set = new SetLL<Integer>();

    assertTrue(set.add(10));
    assertFalse(set.add(10));
    set.add(20);
    set.add(30);
    set.add(40);
    set.add(50);
    assertEquals(5, set.getCurrentSize());
    assertFalse(set.isEmpty());
  }

  @Test
  public void SetInterfaceUsingLLTest4() {
    SetLL<Integer> set = new SetLL<Integer>();

    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    set.add(50);

    set.clear();
    assertEquals(0, set.getCurrentSize());
    assertTrue(set.isEmpty());
  }

  @Test
  public void SetInterfaceUsingLLTest6() {
    SetLL<Integer> set = new SetLL<Integer>();

    set.add(10);
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    set.add(50);
    set.add(60);
    set.add(70);
    set.add(80);
    set.add(90);
    set.add(100);
    assertTrue(set.remove(100));
    assertFalse(set.contains(100));
  }
}

//done, passed the tests