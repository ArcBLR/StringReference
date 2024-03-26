package HomeWork_6_2_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegularSearch implements TextSearch {
    @Override
    public int search(String text, String searchWord) {
        int count = 0;
        Pattern pattern = Pattern.compile("\\b" + searchWord + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}