package HomeWork_6_1_1;

public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму";
        String str2 = "Мама" + " мыла " + "раму";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
