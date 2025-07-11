import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter second number :");
        int num2 = sc.nextInt();
        System.out.print("enter the sym you want to perform :");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : 
            System.out.println("the sum of " + num1 + num2 +" is " + (num1+num2));
            break;
            case '-' :
            System.out.println("the sum of " + num1 + num2 +" is " + (num1-num2));
            break;
            case '*' :
            System.out.println("the sum of " + num1 + num2 +" is " + (num1*num2));
            break;
            case '/' :
            System.out.println("the sum of " + num1 + num2 +" is " + (num1/num2));
            break;
            case '%' :
            System.out.println("the sum of " + num1 + num2 +" is " + (num1%num2));
            break;
            default:
            System.out.println("enter all fields4");
        }
    }
    
}
