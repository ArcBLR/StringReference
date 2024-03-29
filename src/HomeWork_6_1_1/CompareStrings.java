package HomeWork_6_1_1;

public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму";
        String str2 = new String("Мама" + " мыла " + "раму");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("сравнение при помощи \"==\" (сравнение ссылок): " + (str1 == str2));
        System.out.println("сравнение при помощи \"equale\" (сравнение объектов): " + str1.equals(str2));
    }
}
