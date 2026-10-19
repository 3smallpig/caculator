package com.zhuehengan;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Enter q to quit.");

        while (true) {
            System.out.print("First number: ");
            String first = scanner.nextLine().trim();
            if (first.equalsIgnoreCase("q")) {
                break;
            }

            System.out.print("Operator (+, -, *, /): ");
            String operator = scanner.nextLine().trim();

            System.out.print("Second number: ");
            String second = scanner.nextLine().trim();

            try {
                double a = Double.parseDouble(first);
                double b = Double.parseDouble(second);
                double result = calculate(calculator, a, b, operator);
                System.out.println("Result: " + result);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter valid numbers.");
            } catch (ArithmeticException ex) {
                System.out.println(ex.getMessage());
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        scanner.close();
        System.out.println("Calculator closed.");
    }

    private static double calculate(Calculator calculator, double a, double b, String operator) {
        switch (operator) {
            case "+":
                return calculator.add(a, b);
            case "-":
                return calculator.subtract(a, b);
            case "*":
                return calculator.multiply(a, b);
            case "/":
                return calculator.divide(a, b);
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }
}