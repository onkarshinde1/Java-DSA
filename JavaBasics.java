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
        int area = (a*a);
        System.out.println("the average of three number is " + average);
        System.out.println("the area of the square having side A " + area);

        System.out.print("pen price :");
        float pen = sc.nextFloat();
        System.out.print("pencil price :");
        float pencil = sc.nextFloat();
        System.out.print("eraser price :");
        float eraser = sc.nextFloat();

        float sum = (pen + pencil +eraser);
        float gst = sum * 18 / 100 ;
        System.out.println("Total GST on your purchase is " + gst);
        float Fprice = (sum + gst);
        System.out.println("the total price of your purchase is " + Fprice);

        // byte b = '4';
        // char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.99998;

        double result = (f *b ) + (i % c) - (d *s);

        System.out.println(result);
         
    }    
}
