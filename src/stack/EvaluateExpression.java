
/**
 * An arithmetic expression is given by a string array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +, -, *, /. Each string may be an integer or an operator.
 * Note: Reverse Polish Notation is equivalent to Postfix Expression, where operators are written after their operands.
*/

import java.util.*;

public class EvaluateExpression {

    public int solve(String[] A) {
        Stack<Integer> st = new Stack<>();
        for (String token : A) {
            if (isOperator(token)) {
                int operand2 = st.pop();
                int operand1 = st.pop();
                int result = performeOperator(operand1, operand2, token);
                st.push(result);
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }

    public boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    public int performeOperator(int operand1, int operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 + operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String[] input1 = { "2", "1", "+", "3", "*" };
        String[] input2 = { "4", "13", "5", "/", "+" };

        EvaluateExpression solution = new EvaluateExpression();
        System.out.println("Result For A = [\"2\", \"1\", \"+\", \"3\", \"*\"] : " + solution.solve(input1));
        System.out.println("Result For A = [\"4\", \"13\", \"5\", \"/\", \"+\"] : " + solution.solve(input2));
    }

}