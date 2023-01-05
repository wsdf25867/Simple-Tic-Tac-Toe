package tictactoe;

import java.util.Scanner;

public class Main {
    static char[][] board = new char[4][4];
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            board[i / 3 + 1][i % 3 + 1] = ' ';
        }

        printBoard();

        char last = 'O';
        int x;
        int y;

        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();

            if (x >= 4 || y >= 4) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            } else if (board[x][y] != ' ') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }

            if (last == 'O') {
                last = 'X';
            } else {
                last = 'O';
            }

            board[x][y] = last;

            printBoard();

            boolean bX = wins('X');
            boolean bO = wins('O');
            if (bX) {
                System.out.println("X wins");
                break;
            }
            if (bO) {
                System.out.println("O wins");
                break;
            }
            if (draw()) {
                System.out.println("Draw");
                break;
            }
        }
    }

    private static boolean draw() {
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (board[i][j] != ' ') {
                    count++;
                }
            }
        }
        return count == 9;
    }

    private static boolean wins(char candidate) {
        int checkNum = candidate == 'X' ? 264 : 237;
        boolean horizontal = checkHorizontal(checkNum);
        boolean vertical = checkVertical(checkNum);
        boolean cross = checkCross(checkNum);
        return horizontal || vertical || cross;
    }

    private static boolean checkCross(int checkNum) {
        if(board[1][1]+board[2][2]+board[3][3] == checkNum) return true;
        if(board[1][3]+board[2][2]+board[3][1] == checkNum) return true;
        return false;
    }

    private static boolean checkVertical(int checkNum) {
        if(board[1][1]+board[2][1]+board[3][1] == checkNum) return true;
        if(board[1][2]+board[2][2]+board[3][2] == checkNum) return true;
        return board[1][3] + board[2][3] + board[3][3] == checkNum;
    }

    private static boolean checkHorizontal(int checkNum) {
        if(board[1][1]+board[1][2]+board[1][3] == checkNum) return true;
        if(board[2][1]+board[2][2]+board[2][3] == checkNum) return true;
        return board[3][1] + board[3][2] + board[3][3] == checkNum;
    }

    private static void printBoard() {
        System.out.println("---------");
        System.out.printf("| %c %c %c |\n", board[1][1], board[1][2], board[1][3]);
        System.out.printf("| %c %c %c |\n", board[2][1], board[2][2], board[2][3]);
        System.out.printf("| %c %c %c |\n", board[3][1], board[3][2], board[3][3]);
        System.out.println("---------");
    }
}

