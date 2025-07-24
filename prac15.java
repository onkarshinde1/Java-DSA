import java.util.Scanner;

public class prac15 {
    
    public static void average() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num a :");
        int a = sc.nextInt();
        System.out.print("enter num b :");
        int b = sc.nextInt();
        System.out.print("enter num c :");
        int c = sc.nextInt();
        int average = a + b + c / 3;
        System.out.println("the average is " + average);
    }

    public static Boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;

        } else {
            
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num :");
        int num = sc.nextInt();

        if(isEven(num)){
            System.out.println("the nuber is even");
        }else{
            System.out.println("the num is odd");
        }
        
    }
}
