package HomeWork_6_1_1;

public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму";
        String str2_1 = "Мама";
        String str2_2 = " мыла ";
        String str2_3 = "раму";
        String str2 = str2_1 + str2_2 + str2_3;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
