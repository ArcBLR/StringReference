package HomeWork_6_1_2;

import java.util.Scanner;

public class OutputString {
    public static void main(String[] args) {
        Scanner strings = new Scanner(System.in);
        System.out.println("Введите строку которую хотите вывести посимвольно: ");
        String line = strings.nextLine();
        char[] charArray = line.toCharArray();
        for (char i : charArray) {
            System.out.print(" " + i);
        }
        strings.close();
    }
}

