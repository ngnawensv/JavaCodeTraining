public class FactoRecursive {

    public static void main(String[] args) {
        System.out.println(facto(3));

    }

    private static int facto(int i) {
        if (i == 0 || i == 1) {
            return 1;
        }else {
            return i*facto(i-1);
        }
    }
}
