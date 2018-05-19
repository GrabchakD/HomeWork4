package HomeWork2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test()
    public void testFalseOutput() {
        String word = "Hello";
        boolean expectedResult = false;
        boolean actualResult = Task1.checkPalindrom(word);

        assertEquals(expectedResult, actualResult);
    }

    @Test()
    public void testOutputHappyPath() {
        String word = "madam";
        boolean expectedResult = true;
        boolean actualResult = Task1.checkPalindrom(word);

        assertEquals(expectedResult, actualResult);
    }
}