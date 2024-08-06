package pro.sky.calculator_test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculator_test.constants.CalculatorServiceTestConstants.*;

class CalculatorServiceImplParameterizedTest {

    private final CalculatorService out = new CalculatorServiceImpl();


    @ParameterizedTest
    @MethodSource("provideParamsForTestSum")
    void shouldReturnCorrectResultsOfSum(Integer num1, Integer num2, Integer correctResult) {
        int result = out.sum(num1, num2);
        Assertions.assertEquals(result, correctResult);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTestSubtraction")
    void shouldReturnCorrectResultsOfSubtraction(Integer num1, Integer num2, Integer correctResult) {
        int result = out.subtraction(num1, num2);
        Assertions.assertEquals(result, correctResult);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTestMultiply")
    void shouldReturnCorrectResultsOfMultiply(Integer num1, Integer num2, Integer correctResult) {
        int result = out.multiply(num1, num2);
        Assertions.assertEquals(result, correctResult);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTestDivide")
    void shouldReturnCorrectResultsOfDivide(Integer num1, Integer num2, Integer correctResult) {
        int result = out.divide(num1, num2);
        Assertions.assertEquals(result, correctResult);
    }

    @Test
    void shouldThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.divide(NUMBER_1,NUMBER_3));
    }


    public static Stream<Arguments> provideParamsForTestSum() {
        return Stream.of(Arguments.of(NUMBER_1, NUMBER_2, SUM_CORRECT_RESULT_1),
                Arguments.of(NUMBER_3, NUMBER_4, SUM_CORRECT_RESULT_2));
    }
    public static Stream<Arguments> provideParamsForTestSubtraction() {
        return Stream.of(Arguments.of(NUMBER_1, NUMBER_2, SUBTRACTION_CORRECT_RESULT_1),
                Arguments.of(NUMBER_3, NUMBER_4, SUBTRACTION_CORRECT_RESULT_2));
    }
    public static Stream<Arguments> provideParamsForTestMultiply() {
        return Stream.of(Arguments.of(NUMBER_1, NUMBER_2, MULTIPLY_CORRECT_RESULT_1),
                Arguments.of(NUMBER_3, NUMBER_4, MULTIPLY_CORRECT_RESULT_2));
    }
    public static Stream<Arguments> provideParamsForTestDivide() {
        return Stream.of(Arguments.of(NUMBER_1, NUMBER_2, DIVIDE_CORRECT_RESULT_1),
                Arguments.of(NUMBER_3, NUMBER_4, DIVIDE_CORRECT_RESULT_2));
    }
}