package HomeWork_6_2_2;

public class NormalSearch implements TextSearch {
    @Override
    public int search(String text, String searchWord) {
        int count = 0;
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                count++;
            }
        }
        return count;
    }
}
