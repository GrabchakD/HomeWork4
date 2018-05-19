package HomeWork;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task2Test {

    private int[] arr;

    @Before
    public void init() {
        arr = new int[10];
    }

    @Test(expected = NegativeArraySizeException.class)
    public void testArrayNotNegativeSize() {
        arr = new int[-1];
    }

    @Test
    public void testAddIntegerToArray() {
        int expected = 2;

        arr[0] = expected;

        Assert.assertEquals(expected, arr[0]);
    }
}