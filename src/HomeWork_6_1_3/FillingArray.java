package HomeWork_6_1_3;

import java.util.ArrayList;
import java.util.Scanner;

public class FillingArray {
    public static void main(String[] args) {
        ArrayList fillingArray = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < i + 1 & i > 0; i++) {
            System.out.println("Введите элемент для добавления в лист (для окончания введите \"stop\"): ");
            String next = scanner.nextLine();
            fillingArray.add(next);
            switch (next) {
                case "stop":
                    i = -1;
                    fillingArray.remove("stop");
                    System.out.println(fillingArray);
                    break;
            }
        }
    }
}