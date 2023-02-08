package AlgoAnalysis.MockExam;

import org.junit.Test;

import static org.junit.Assert.*;

public class STest {
    @Test
    public void addTest() {
        Set set = new Set();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        assertArrayEquals(new int[]{1, 2, 3, 4}, set.toArray());
    }

    @Test
    public void removeTest() {
        Set set = new Set();
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(2);
        assertArrayEquals(new int[]{1, 3}, set.toArray());
    }

    @Test
    public void containsTest() {
        Set set = new Set();
        set.add(1);
        set.add(2);
        set.add(3);
        assertTrue(set.contains(2));
        assertFalse(set.contains(4));
    }

    @Test
    public void toArrayTest() {
        Set set = new Set();
        set.add(1);
        set.add(2);
        set.add(3);
        assertArrayEquals(new int[]{1, 2, 3}, set.toArray());
    }

    @Test
    public void clearTest() {
        Set set = new Set();
        set.add(1);
        set.add(2);
        set.add(3);
        set.clear();
        assertEquals(0, set.getSize());
    }

    @Test
    public void getSizeTest() {
        Set set = new Set();
        set.add(1);
        set.add(2);
        set.add(3);
        assertEquals(3, set.getSize());
    }

    @Test
    public void isEmptyTest() {
        Set set = new Set();
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    public void unionTest() {
        Set setA = new Set();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        Set setB = new Set();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        Set setC = Set.union(setA, setB);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, setC.toArray());
    }

    @Test
    public void intersectTest() {
        Set setA = new Set();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        Set setB = new Set();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        Set setC = Set.intersect(setA, setB);
        assertArrayEquals(new int[]{3}, setC.toArray());
    }
    @Test
    public void differenceTest() {
        Set setA = new Set();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        Set setB = new Set();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        Set setC = Set.difference(setA, setB);
        assertArrayEquals(new int[]{1, 2}, setC.toArray());
    }
}