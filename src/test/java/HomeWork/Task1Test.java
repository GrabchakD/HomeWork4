package HomeWork;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testKeyLongerThanArrLength() {
        int k = 100;
        int[] arr = new int[7];

        Task1.rotateArr(arr, k);
    }
}