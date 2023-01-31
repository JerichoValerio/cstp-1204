package AlgoAnalysis.Assignment1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SetLLTest {

  @Test
  public void testAddMethod() {
    SetLL<Integer> set = new SetLL<>();
    assertTrue(set.add(1));
    assertTrue(set.add(2));
    assertTrue(set.add(3));
    assertFalse(set.add(3));
  }

  @Test
  public void testRemoveMethod() {
    SetLL<Integer> set = new SetLL<>();
    set.add(1);
    set.add(2);
    set.add(3);
    assertTrue(set.remove(2));
    assertFalse(set.remove(4));
  }

  @Test
  public void testContainsMethod() {
    SetLL<Integer> set = new SetLL<>();
    set.add(1);
    set.add(2);
    set.add(3);
    assertTrue(set.contains(2));
    assertFalse(set.contains(4));
  }

  @Test
  public void testIsEmptyMethod() {
    SetLL<Integer> set = new SetLL<>();
    assertTrue(set.isEmpty());
    set.add(1);
    set.add(2);
    assertFalse(set.isEmpty());
  }

  @Test
  public void testClearMethod() {
    SetLL<Integer> set = new SetLL<>();
    set.add(1);
    set.add(2);
    set.clear();
    assertTrue(set.isEmpty());
  }

  @Test
  public void testToArrayMethod() {
    SetLL<Integer> set = new SetLL<>();
    set.add(1);
    set.add(2);
    set.add(3);
    Integer[] expected = {1, 2, 3};
    assertArrayEquals(expected, set.toArray());
  }
}
