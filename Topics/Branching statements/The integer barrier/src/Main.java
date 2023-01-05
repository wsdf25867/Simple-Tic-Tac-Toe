import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
            sum += num;
            if (num == 0) {
                System.out.println(sum);
                break;
            }
            if (sum >= 1000) {
                sum -= 1000;
                System.out.println(sum);
                break;
            }
        }
    }
}