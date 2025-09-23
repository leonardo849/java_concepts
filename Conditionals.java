public class Conditionals {
    public static void main(String[] args) {
        boolean isItRaining = true;
        if (isItRaining) {
            System.out.println("like js and go. You don't need to type var == true, it's needed only to type the var");
        }

        // short conditionals, like js
        String text = isItRaining ? "it's raining" : "it isn't raining";
        System.out.println(text);

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("it's sunday");
                break;
            default:
                System.out.println("it isn't sunday");
        }
    }
}
