import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int direction = scanner.nextInt();

        String message = switch (direction) {
            case 0 -> "do not move";
            case 1 -> "move up";
            case 2 -> "move down";
            case 3 -> "move left";
            case 4 -> "move right";
            default -> "error!";
        };

        System.out.println(message);
    }
}