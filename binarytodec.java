public class binarytodec {

    public static void binarytodec(int binNum) {
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;

            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }

        System.out.println("the decimal of " + myNum + " is " + decNum);
    }

    public static void dectobin(int n) {
        int decNum = n;
        int binNum = 0;
        int pow = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + rem * (int) Math.pow(10, pow);

            pow++;

            n = n / 2;
        }
        System.out.println("binary form of num "+ decNum + " is " + binNum);
    }

    public static void main(String[] args) {
        binarytodec(0);
        dectobin(0);
    }
}
