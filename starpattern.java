public class starpattern {
    public static void main(String[] args) {


        // inverted star pyramid 
        int n = 10;
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= n-line+1; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // star pyramid 
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <=line; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
