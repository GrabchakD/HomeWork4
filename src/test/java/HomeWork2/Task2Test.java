package HomeWork2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testWrongIndexEnd() {
        int indexStart = 2;
        int indexEnd = 50;
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        Task2.reversePart(indexStart, indexEnd, ch);
    }

    @Test
    public void testInputHappyPath() {
        char[] expectedResult = {'a', 'b', 'e', 'd', 'c', 'f', 'g'};                    //not correct work

        int indexStart = 2;
        int indexEnd = 4;
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] actualResult = Task2.reversePart(indexStart, indexEnd, ch);

        assertEquals(expectedResult, actualResult);
    }

}