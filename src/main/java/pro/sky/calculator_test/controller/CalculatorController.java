package pro.sky.calculator_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator_test.service.CalculatorService;

import java.io.IOException;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/plus")
    public String sum(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        int result = calculatorService.sum(number1, number2);
        return number1 + " + " + number2 + " = " + result;
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        int result = calculatorService.subtraction(number1, number2);
        return number1 + " - " + number2 + " = " + result;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        int result = calculatorService.multiply(number1, number2);
        return number1 + " * " + number2 + " = " + result;
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        int result = calculatorService.divide(number1, number2);
        return number1 + " / " + number2 + " = " + result;
    }

}

