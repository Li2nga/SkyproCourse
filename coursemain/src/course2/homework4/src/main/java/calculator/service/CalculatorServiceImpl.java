package calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String plus(int num1, int num2) {
        return num1 + "+" + num2 + "=" + (num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return num1 + "-" + num2 + "=" + (num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return num1 + "*" + num2 + "=" + (num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return "Деление на ноль невозможно ";
        } else {
            return num1 + "/" + num2 + "=" + ((double) num1 / (double) num2);
        }
    }
}
