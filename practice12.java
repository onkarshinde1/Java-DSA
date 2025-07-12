import java.util.Scanner;

public class practice12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("enter the number :");
        // int num = sc.nextInt();

        // if(num < 0){
        // System.out.println("the number is negative.");
        // }else{
        // System.out.println("the num is positive");
        // }
        // }

        // double temp = 10.5;

        // if (temp > 100) {
        // System.out.println(" you have a fever.");
        // } else {
        // System.out.println("you dont have a fever.");
        // }

        // int weekday = sc.nextInt();

        // switch (weekday) {
        // case 1:
        // System.out.println("monday");
        // break;
        // case 2:
        // System.out.println("tuesday");
        // break;
        // case 3:
        // System.out.println("wednesday");
        // break;
        // case 4:
        // System.out.println("thrsday");
        // break;
        // case 5:
        // System.out.println("friday");
        // break;
        // case 6:
        // System.out.println("saturday");
        // break;
        // case 7:
        // System.out.println("sunday");
        // break;
        // default:
        // System.out.println("enter valid date");
        // break;
        // }

        System.out.println("enter the year :");
        int year = sc.nextInt();

        if (year / 4 == 0 && (year / 100 == 0 || year / 400 == 0)) {
            System.out.println(year + " is a leap year.");

        } else {
            System.out.println(year + " is a not leap year");
        }

    }
}