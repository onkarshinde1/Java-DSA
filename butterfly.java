public class butterfly {

    public static void butterfly(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                // star
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= i; j++) {
                // star
                System.out.print("*");
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        butterfly(10
        );
    }
}
