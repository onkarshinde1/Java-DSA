import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num :");
        int num = sc.nextInt();

        System.out.println("the sum of "+sunofDigits(num));

    }


    public static int sunofDigits(int num){
        int sumofnum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sumofnum = sumofnum+ lastDigit;

            num = num / 10;
        }
        return sumofnum;
    } 
   
}

