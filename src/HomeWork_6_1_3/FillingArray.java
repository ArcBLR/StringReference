package HomeWork_6_1_3;

import java.util.ArrayList;
import java.util.Scanner;

public class FillingArray {
    public static void main(String[] args) {
        ArrayList fillingArray = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите элемент для добавления (для окончания введите \"stop\"): ");
            String next = scanner.nextLine();
            if (next.equals("stop"))
                break;
            fillingArray.add(next);
        }
        for (int j = 0; j < fillingArray.size(); j++) {
            System.out.print(fillingArray.get(j) + " ");
        }
    }
}