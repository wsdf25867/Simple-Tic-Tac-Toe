import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String firstS = scanner.next();
        String operator = scanner.next();
        String secondS = scanner.next();
        if ("0".equals(secondS)) {
            System.out.println("Division by 0!");
            return;
        }

        long first = Long.parseLong(firstS);
        long second = Long.parseLong(secondS);
        switch (operator) {
            case "+" -> System.out.println(first + second);
            case "-" -> System.out.println(first - second);
            case "/" -> System.out.println(first / second);
            case "*" -> System.out.println(first * second);
            default -> System.out.println("Unknown operator");
        };
    }
}