import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String text = "cr7 is an awful soccer player";
        System.out.println(text.endsWith("r")); // true
        System.out.println(text.startsWith("r")); // false
        System.out.println(text.substring(0,3)); //cr7
        System.out.println(text.valueOf(true)); // "true"
        System.out.println(Arrays.toString(text.split(" "))); // [cr7, is, an, awful, soccer, player]
        System.out.println(text.indexOf("7")); // 2
    }
}
