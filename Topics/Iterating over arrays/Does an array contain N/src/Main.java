import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int condition = sc.nextInt();

        for (int number : numbers) {
            if (number == condition) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
}