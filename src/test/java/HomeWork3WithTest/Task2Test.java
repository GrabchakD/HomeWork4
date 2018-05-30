package HomeWork3WithTest;

import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.Assert.*;

public class Task2Test {

    Stack<String> stack;

    @Before
    public void init() {
        stack = new Stack<>();
    }

    @Test(expected = EmptyStackException.class)
    public void testUsePopToEmtyStack() {
        stack.pop();
    }

    @Test
    public void testPushToStack() {
        String expectedResult = "Hi";

        stack.push("Hi");

        String actualResult = stack.peek();

        assertEquals(expectedResult, actualResult);
    }
}