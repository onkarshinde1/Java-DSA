public class primeinrange {

    public static boolean isPrime(int n) {
        if (n == 2) {
            System.out.println("2 is a prime number");
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primenum(int n) {
        for(int i = 2; i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(isPrime(10));

        primenum(100);
    }
}
