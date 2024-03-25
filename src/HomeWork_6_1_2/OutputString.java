package HomeWork_6_1_2;

import java.util.Scanner;

public class OutputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] charArray = line.toCharArray();
        for (char i : charArray) {
            System.out.print(" " + i);
        }
        scanner.close();
    }
}
