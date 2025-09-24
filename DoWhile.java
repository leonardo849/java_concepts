public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do { // do first, check afterward
            i++;
            System.out.println("i:" + i);
        } while (i < 3);

        i = 0;

        while (i < 3) { // do afterward, check before
            i++;
            System.out.println("i:" + i);
        }
    }
}
