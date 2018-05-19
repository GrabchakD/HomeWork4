package HomeWork;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    private int[] arr;

    @Before
    public void init() {
        arr = new int[10];
    }

    @Test
    public void testCheckSetLengthArray() {
        int expected = 5;

        arr = new int[expected];

        assertEquals(expected, arr.length);
    }

    @Test(expected = NullPointerException.class)
    public void testWrongArrayWithNull() {
        int arrlength = 5;
        arr = null;

        assertEquals(arrlength, arr.length);
    }
}