package HomeWork_6_1_4;

public class LongVariable {
    public static void main(String[] args) {
        String str = "012312";
        long num1 = Integer.parseInt(str);
        System.out.println("Способ 1 Integer.parseInt: "+num1);
        long num2 = Integer.valueOf(str);
        System.out.println("Способ 2 Integer.valueOf: "+num2);
        Long num3 = Long.parseLong(str);
        System.out.println("Способ 3 Long.parseLong: "+num3);
        Long num4 = Long.valueOf(str);
        System.out.println("Способ 4 Long.valueOf: "+num4);
    }
}
