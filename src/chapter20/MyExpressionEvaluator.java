package chapter20;

import java.util.*;
import java.util.function.IntBinaryOperator;

public class MyExpressionEvaluator {
    private static Map<String, IntBinaryOperator> operatorFunctions = new HashMap<>();
    static {
        operatorFunctions.put("*", (a, b) -> b * a);
        operatorFunctions.put("/", (a, b) -> b / a);
        operatorFunctions.put("+", (a, b) -> b + a);
        operatorFunctions.put("-", (a, b) -> b - a);
    }

    private static Stack<String> opsStack = new Stack<>();
    private static Stack<Integer> operands = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = "";
        while (!(line = scanner.nextLine()).equals("exit")) {

            String[] expression = line.split("\\s");

            try {
                for (String item : expression) {
                    System.out.printf("directing [%s] item...%n", item);

                    switch (item) {

                        case "(":
                            opsStack.push(item);
                            break;

                        case "+":
                        case "-":
                            process(operatorFunctions.keySet());
                            opsStack.push(item);
                            break;

                        case "*":
                        case "/":
                            process(Set.of("*", "/"));
                            opsStack.push(item);
                            break;

                        case ")":
                            process(Set.of("*", "/", "-", "+", "("));
                            break;

                        default:
                            operands.push(Integer.parseInt(item));
                    }

                    System.out.printf("operators: %s, operands: %s%n", opsStack, operands);
                }

                //final operator evaluation
                process(Set.of("*", "/", "-", "+", "(", ")"));
                if (!operands.isEmpty()) {
                    throw new IllegalArgumentException();
                }
                System.out.printf("result is [%s]%n%n", operands.pop());

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    /**
     * evaluates all so far available operations
     *
     * @param ops set allowed for processing operators
     */
    private static void process(Set<String> ops) {

        while (!opsStack.empty() && !Collections.disjoint(opsStack, ops)){
            String operator = opsStack.pop();
            System.out.printf("processing [%s] operator...%n", operator);
            if (operator.equals(")"))
                continue;
            if (operator.equals("("))
                return;
            int result = operatorFunctions.get(operator).applyAsInt(operands.pop(), operands.pop());
            operands.push(result);
        }

    }
}
