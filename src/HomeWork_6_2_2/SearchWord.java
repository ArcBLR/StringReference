package HomeWork_6_2_2;

import java.io.*;
import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово которое хотите найти:");
        String searchWord = sc.nextLine();
        String file = "WarAndPeace.txt";
        String content = readFile(file);
        sc.close();
        TextSearch normalSearch = new NormalSearch();
        TextSearch regularSearch = new RegularSearch();

        int normalCount = normalSearch.search(content, searchWord);
        int regularCount = regularSearch.search(content, searchWord);

        System.out.println("Слово \"" + searchWord + "\" найдено " + normalCount + " раз(а) с помощью обычного поиска.");
        System.out.println("Слово \"" + searchWord + "\" найдено " + regularCount + " раз(а) с помощью регулярных выражений.");
    }

    private static String readFile(String file) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
            return content.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}