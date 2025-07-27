import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);
        System.out.print("phy :");
        marks[0] = sc.nextInt();
        System.out.print("chem :");
        marks[1] = sc.nextInt();
        System.out.print("math :");
        marks[2] = sc.nextInt();

        int percentage = (marks[0]+marks[1]+marks[2]) / 3;

        System.out.println("the percentage is "+ percentage);
    }
}
