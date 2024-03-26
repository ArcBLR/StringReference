package HomeWork_6_2_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        final String string = "Мой номер телефона +375-29-1234567. Мой ник в Телеграм @TheGodFather.";
        final String tgRegex = "@(\\w+)";
        final String phoneRegex = "\\d{7}";

        final Pattern tgPattern = Pattern.compile(tgRegex);
        final Matcher tgMatcher = tgPattern.matcher(string);
        while (tgMatcher.find()) {
            System.out.println("Мой ник в Телеграм без \"@\": " + tgMatcher.group(1));
        }

        final Pattern phonePattern = Pattern.compile(phoneRegex);
        final Matcher phoneMatcher = phonePattern.matcher(string);
        while (phoneMatcher.find()) {
            System.out.println("Мой номер телефона без кода: " + phoneMatcher.group(0));
        }
    }
}


