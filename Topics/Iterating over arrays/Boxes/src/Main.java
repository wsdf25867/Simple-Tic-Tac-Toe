import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int[] box1 = new int[3];
        int[] box2 = new int[3];

        for (int i = 0; i < 3; i++) {
            box1[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            box2[i] = sc.nextInt();
        }

        Arrays.sort(box1);
        Arrays.sort(box2);

        boolean x = false;
        boolean y = false;
        boolean z = false;

        if (box1[0] == box2[0]) {
            System.out.println("Incompatible");
            return;
        }
        if (box1[1] == box2[1]) {
            System.out.println("Incompatible");
            return;
        }
        if (box1[2] == box2[2]) {
            System.out.println("Incompatible");
            return;
        }


        if (box1[0] < box2[0]) {
            x = true;
        }
        if (box1[1] < box2[1]) {
            y = true;
        }
        if (box1[2] < box2[2]) {
            z = true;
        }

        if (x && y && z) {
            System.out.println("Box 1 < Box 2");
        } else if (!x && !y && !z) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}