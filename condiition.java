import java.util.Scanner;

public class condiition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your age :");
        int age = sc.nextInt();
        if(age <= 18){
            System.out.println(" teen");
        }else if(age >= 18 && age <= 30){
            System.out.println("adult");
        }else{
            System.out.println("men");
        }
    }
}
