import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        System.out.println("1 :samosa\n 2 :wadapaw\n 3 :3bhaje");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your order :");
        int order = sc.nextInt();
        switch (order) {
            case 1:
                System.out.println("samosa YOUR ORDER PLACED SUCCESFULLY");
                break;
            case 2:
                System.out.println("wadapaw YOUR ORDER PLACED SUCCESFULLY");
                break;
            case 3:
                System.out.println("bhaje YOUR ORDER PLACED SUCCESFULLY");
                break;
            default:
                System.out.println("not in menu");
                break;
        }
    }
}
