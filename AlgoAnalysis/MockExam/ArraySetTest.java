package AlgoAnalysis.MockExam;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArraySetTest {
    @Test
    public void SetInterfaceArraysTest1() {
        ArraySet<Integer> set = new ArraySet<Integer>();
  
      // This is before we put anything into the set
      assertEquals(0, set.getCurrentSize());
      assertTrue(set.isEmpty());
      assertFalse(set.remove(5));
    }
  
    @Test
    public void SetInterfaceArraysTest2() {
        ArraySet<Integer> set = new ArraySet<Integer>();
  
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
    public void SetInterfaceArraysTest3() {
        ArraySet<Integer> set = new ArraySet<Integer>();
  
      assertTrue(set.add(10));
      assertFalse(set.add(10));
      assertTrue(set.remove(10));
      assertTrue(set.isEmpty());
      set.add(20);
      set.add(30);
      assertTrue(set.contains(20));
      set.add(40);
      assertTrue(set.remove(40));
      set.add(50);
      assertTrue(set.remove(50));
      assertFalse(set.contains(50));
    }
  
    @Test
    public void SetInterfaceArraysTest4() {
        ArraySet<Integer> set = new ArraySet<Integer>();
  
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
    public void SetInterfaceArraysTest6() {
        ArraySet<Integer> set = new ArraySet<Integer>();
  
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

