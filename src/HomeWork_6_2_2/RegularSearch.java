package HomeWork_6_2_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegularSearch implements TextSearch {

    @Override
    public int search(String text, String searchWord) {
        int summ = 0;
        Pattern pattern = Pattern.compile("\\b" + searchWord + "\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            summ++;
        }
        return summ;
    }
}