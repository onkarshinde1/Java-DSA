import java.util.Scanner;

public class evenoddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do {
            System.out.println("enter your number :");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }

            System.out.println("if you want to continue the game press 1 for yes and 2 for no");

            choice = sc.nextInt();
        } while (choice == 1);
        System.out.println("the sum of even numbers is " + evensum);
        System.out.println("the sum of odd numbers is " + oddsum);

    }
}
