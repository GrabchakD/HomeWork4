package HomeWork2;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task3Test {

    @Test(expected = NullPointerException.class)
    public void testTransferNullStringToMethod() {
        String s = null;
        char c = '8';
        Task3.findCharCount(s, c);
    }

    @Test
    public void testOutputHappyPath() {
        int expectedResult = 10;

        String str = "aaa156aadfsdaeraaaawq";
        char ch = 'a';
        int actualResult = Task3.findCharCount(str, ch);

        assertEquals(expectedResult, actualResult);
    }
}