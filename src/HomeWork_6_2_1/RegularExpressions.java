package HomeWork_6_2_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        final String string = "Мой номер телефона +375-29-1234567. Мой ник в Телеграм @TheGodFather.";

        final Pattern tgPattern = Pattern.compile("@(\\w+)");
        final Matcher tgMatcher = tgPattern.matcher(string);
        while (tgMatcher.find()) {
            System.out.println("\nМой ник в Телеграм без \"@\": " + tgMatcher.group(1));
        }
        final Pattern phonePattern = Pattern.compile("\\d{7}");
        final Matcher phoneMatcher = phonePattern.matcher(string);
        while (phoneMatcher.find()) {
            System.out.println("Мой номер телефона без кода: " + phoneMatcher.group(0));
        }
    }
}

