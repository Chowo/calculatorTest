package pro.sky.calculator_test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculator_test.constants.CalculatorServiceTestConstants.*;

class CalculatorServiceImplTest {

    private final CalculatorService out = new CalculatorServiceImpl();


    @Test
    void shouldReturnSumOfNumbers1() {
        int result = out.sum(NUMBER_1, NUMBER_2);
        Assertions.assertEquals(result, SUM_CORRECT_RESULT_1);
    }
    @Test
    void shouldReturnSumOfNumbers2() {
        int result = out.sum(NUMBER_3, NUMBER_4);
        Assertions.assertEquals(result, SUM_CORRECT_RESULT_2);
    }

    @Test
    void shouldReturnSubtractionOfNumbers1() {
        int result = out.subtraction(NUMBER_1, NUMBER_2);
        Assertions.assertEquals(result, SUBTRACTION_CORRECT_RESULT_1);
    }
    @Test
    void shouldReturnSubtractionOfNumbers2() {
        int result = out.subtraction(NUMBER_3, NUMBER_4);
        Assertions.assertEquals(result, SUBTRACTION_CORRECT_RESULT_2);
    }

    @Test
    void shouldMultipliedNumbers1() {
        int result = out.multiply(NUMBER_1, NUMBER_2);
        Assertions.assertEquals(result, MULTIPLY_CORRECT_RESULT_1);
    }
    @Test
    void shouldMultipliedNumbers2() {
        int result = out.multiply(NUMBER_3, NUMBER_4);
        Assertions.assertEquals(result, MULTIPLY_CORRECT_RESULT_2);
    }

    @Test
    void shouldReturnDivideResult1() {
        int result = out.divide(NUMBER_1, NUMBER_2);
        Assertions.assertEquals(result, DIVIDE_CORRECT_RESULT_1);
    }
    @Test
    void shouldReturnDivideResult2() {
        int result = out.divide(NUMBER_3, NUMBER_4);
        Assertions.assertEquals(result, DIVIDE_CORRECT_RESULT_2);
    }
    @Test
    void shouldThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.divide(NUMBER_1,NUMBER_3));
    }
}