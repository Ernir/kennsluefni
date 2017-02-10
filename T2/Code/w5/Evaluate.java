/*
Implements Dijkstra's Two Stack Algorithm for evaluating fully parenthesized arithmetic expressions

Based on "Evaluate.java" as presented in
http://algs4.cs.princeton.edu/lectures/13StacksAndQueues.pdf
 */

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {
    private static Stack<String> operators;
    private static Stack<Double> values;

    private static void evaluateToken(String token) {
        /*
        Reads arithmetic operators, parses numbers, and ignores everything else (including "(" ).
        When ")" is encountered, calculate the result of the most recent expression.
         */
        switch (token) {
            case "+":
                operators.push(token);
                break;
            case "-":
                operators.push(token);
                break;
            case "*":
                operators.push(token);
                break;
            case "/":
                operators.push(token);
                break;
            case ")":
                calculate();
                break;
            default:
                try {
                    Double number = Double.parseDouble(token);
                    values.push(number);
                } catch (Exception e) {
                    // Ignore all non-numeric tokens!
                }
        }
    }

    private static void calculate() {
        /*
        Calculates the result of applying the most recent operator to the two most recently encountered numbers
         */
        String op = operators.pop();
        double v = values.pop();
        switch (op) {
            case "+":
                v = values.pop() + v;
                break;
            case "-":
                v = values.pop() - v;
                break;
            case "*":
                v = values.pop() * v;
                break;
            case "/":
                v = values.pop() / v;
                break;
        }
        values.push(v);
    }

    public static double evaluateExpression(String expression) {
        /*
        Evaluates a fully parenthesized arithmetic expression, where tokens are separated by spaces
         */
        operators = new Stack<>();
        values = new Stack<>();
        String[] parts = expression.split(" ");
        for (String token : parts) {
            evaluateToken(token);
        }

        return values.pop();
    }

    public static void main(String[] args) {
        String expression = "( 11 + ( ( 2 * 4 ) / 2 ) )";
        StdOut.println(evaluateExpression(expression));
    }
}