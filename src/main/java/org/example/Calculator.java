package org.example;

import java.util.Objects;

public class Calculator {
    private int Total;
    int num2;

    double o = 0;




    UserInput userInput = new UserInput();

    public void runCalculator(){
        boolean isActive = true;
        userInput.printMessage("Enter a number");
        o = userInput.getNumber();
        userInput.printMessage("Square root [y/n]");
        String userIn = userInput.getString();
        if (Objects.equals(userIn, "y")){
            calculate((int) o);
        }else {
            while (isActive) {
                userInput.printMessage("Enter a number");
                num2 = userInput.getNumber();
                userInput.printMessage("Enter operator(+*/-=**)");
                String operator = userInput.getOperator();
                calculate(o, num2, operator);
                userInput.printMessage("continue [y/n]");
                String input = userInput.getString();
                if (Objects.equals(input, "n")){
                    isActive = false;
                }
            }
        }

    }

    public void calculate(int num1, int num2, String operator){
        switch (operator){
            case "+":
                o = num1 + num2;
                break;
            case "-":
                o = num1 - num2;
                break;
            case "*":
                o = num1 * num2;
                break;
            case "/":
                o = num1 / num2;
                break;
            case "^":
                o = (int) Math.pow(num1, num2);
                break;
            case "s":
                o = (int) Math.sqrt(num1);
                break;
            default:
                throw new IllegalArgumentException("Error - you did not input a valid operator");
        }
        userInput.printMessage("answer is " + o);
    }

    public void calculate(int num1){
        o = (int) Math.sqrt(num1);
        userInput.printMessage("answer is " + o);
    }

    public void calculate(double num1){
        o = (int) Math.sqrt(num1);
        userInput.printMessage("answer is " + o);
    }
    public void calculate(double num1, double num2, String operator){
        switch (operator){
            case "+":
                o = num1 + num2;
                break;
            case "-":
                o = num1 - num2;
                break;
            case "*":
                o = num1 * num2;
                break;
            case "/":
                o = num1 / num2;
                break;
            case "^":
                o = (int) Math.pow(num1, num2);
                break;
            case "s":
                o = (int) Math.sqrt(num1);
                break;
            default:
                throw new IllegalArgumentException("Error - you did not input a valid operator");
        }
        userInput.printMessage("answer is " + o);
    }

    public double getO() {
        return o;
    }
}
