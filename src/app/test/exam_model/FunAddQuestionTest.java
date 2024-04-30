package test.exam_model;

import org.testng.annotations.Test;

public class FunAddQuestionTest {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        int result = a + b;
        // Asserts that the result of addition is 8
        org.testng.Assert.assertEquals(result, 8);
    }

    @Test
    public void testSubtraction() {
        int a = 5;
        int b = 3;
        int result = a - b;
        // Asserts that the result of subtraction is 2
        org.testng.Assert.assertEquals(result, 2);
    }
}