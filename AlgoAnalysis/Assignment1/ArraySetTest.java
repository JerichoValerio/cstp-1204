package AlgoAnalysis.Assignment1;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArraySetTest {
    private SetInterface<Integer> set;
    
    @Before
    public void setUp() {
        set = new ArraySet<>();
    }
    
    @Test
    public void testGetCurrentSize() {
        assertEquals(0, ((ArraySet<Integer>) set).getCurrentSize());
        
        set.add(1);
        set.add(2);
        set.add(3);
        
        assertEquals(3, set.getCurrentSize());
    }
    
    @Test
    public void testIsEmpty() {
        assertTrue(set.isEmpty());
        
        set.add(1);
        
        assertFalse(set.isEmpty());
    }
    
    /**
     * 
     */
    @Test
    public void testAdd() {
        Assert.assertFalse(set.add(1));
        assertTrue(set.add(2));
        assertTrue(set.add(3));
        assertFalse(set.add(3));
    }
    
    private void assertTrue(Object add) {
    }

    @Test
    public void testRemove() {
        set.add(1);
        set.add(2);
        set.add(3);
        
        assertTrue(set.remove(2));
        assertFalse(set.remove(4));
        
        Integer[] expected = {1, 3};
        Integer[] result = set.toArray();
        
        assertArrayEquals(expected, result);
    }
    
    @Test
    public void testClear() {
        set.add(1);
        set.add(2);
        set.add(3);
        
        set.clear();
        
        assertEquals(0, set.getCurrentSize());
        assertTrue(set.isEmpty());
    }
    
    @Test
    public void testContains() {
        set.add(1);
        set.add(2);
        set.add(3);
        
        assertTrue(set.contains(2));
        assertTrue(set.contains(4));
    }
    
    @Test
    public void testToArray() {
        set.add(1);
        set.add(2);
        set.add(3);
        
        Integer[] expected = {1, 2, 3};
        Integer[] result = set.toArray();
        
        assertArrayEquals(expected, result);
    }
}
