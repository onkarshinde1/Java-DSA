import java.util.Scanner;

public class funcOpe {
    
    // the sum of nums
    public static int sumofnum(int a, int b) {

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum is " + sum);
        return sum;
    }
    // find factorial
    public static int factorial(int n) {

        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }


    // find binomial coefficient

    public static int binCoeff(int n , int r){
        
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
        
    }

    public static void main(String[] args) {
        
        sumofnum(44 , 5);
        System.out.println(factorial(10));
        
        System.out.println(binCoeff(5, 2));

    }
}
