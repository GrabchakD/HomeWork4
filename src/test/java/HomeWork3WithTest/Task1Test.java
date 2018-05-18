package HomeWork3WithTest;


import org.junit.Assert;
import org.junit.Test;


public class Task1Test {

    @Test
    public void testCheckOutputIfInputCorrect() {
        String expected = "Output is correct";
        String actual = Task1.inputCheck("()");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCheckOutputIfInputNotCorrect() {
        String expected = "Output isn`t correct";
        String actual = Task1.inputCheck("(}");
        Assert.assertEquals(expected, actual);
    }
}