package pro.sky.calculator_test.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hello() {
        return "<b>Добро пожаловать в калькулятор!<b>";
    }


    @Override
    public int sum(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            throw new IllegalArgumentException("Один или оба параметра не определены");
        }
        return number1 + number2;
    }

    @Override
    public int subtraction(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            throw new IllegalArgumentException("Один или оба параметра не определены");
        }
        return number1 - number2;
    }

    @Override
    public int multiply(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            throw new IllegalArgumentException("Один или оба параметра не определены");
        }
        return number1 * number2;
    }

    @Override
    public int divide(Integer number1, Integer number2) {
        if (number1 == null || number2 == null) {
            throw new IllegalArgumentException("Один или оба параметра не определены");
        }
        if (number2 == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено");
        }
        return number1 / number2;
    }

}
