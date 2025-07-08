import java.util.Scanner;

public class JavaBasics {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number :");
        int a = sc.nextInt();
        System.out.print("enter the second number :");
        int b = sc.nextInt();
        System.out.print("enter the third number :");
        int c = sc.nextInt();
        // System.out.println("Hello World.!!");


        int average =(a+b+c)/3;
        System.out.println("the average of three number is " + average);
    }    
}
