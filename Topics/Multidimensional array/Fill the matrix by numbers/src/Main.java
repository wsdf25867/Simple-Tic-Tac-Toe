import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] numbers = new int[n][n];

        for (int i = 0; i < n; i++) {
            numbers[i][i] = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                numbers[i][j] = j - i;
                numbers[j][i] = j - i;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", numbers[i][j]);
            }
            System.out.println();
        }
    }
}