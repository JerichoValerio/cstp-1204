import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HashDictionaryTest {

    private HashDictionary<String, Integer> dictionary;

    
    @Before
    public void setUp() throws Exception {
        dictionary = new HashDictionary<>(4);
        dictionary.put("one", 1);
        dictionary.put("two", 2);
        dictionary.put("three", 3);
    }


    @Test
    public void testPut() {
        dictionary.put("four", 4);
        assertEquals(Integer.valueOf(4), dictionary.get("four"));
    }


    @Test
    public void testGet() {
        assertEquals(Integer.valueOf(2), dictionary.get("two"));
    }


    @Test
    public void testRemove() {
        dictionary.remove("two");
        assertNull(dictionary.get("two"));
        assertEquals(2, dictionary.getSize());
    }


    @Test
    public void testResize() {
        dictionary.put("four", 4);
        dictionary.put("five", 5);
        dictionary.put("six", 6);
        dictionary.put("seven", 7);
        assertEquals(7, dictionary.getSize());
        assertEquals(Integer.valueOf(4), dictionary.get("four"));
        assertEquals(Integer.valueOf(5), dictionary.get("five"));
        assertEquals(Integer.valueOf(6), dictionary.get("six"));
        assertEquals(Integer.valueOf(7), dictionary.get("seven"));
    }

}
