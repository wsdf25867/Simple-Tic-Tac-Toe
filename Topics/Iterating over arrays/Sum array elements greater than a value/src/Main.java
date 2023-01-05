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
        int limit = sc.nextInt();
        int sum = 0;
        for (int number : numbers) {
            if (number > limit) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}