import java.util.Scanner;

public class subString {


    public static String subStrings(String name , int start , int end){

       String result = "";

       
        for (int i = start; i < end; i++) {
            result += name.charAt(i); 
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(subStrings(name,start,end));
        String inbuiltSub = name.substring(0, 5);
        System.out.println(inbuiltSub);
    }
}
