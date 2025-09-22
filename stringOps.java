import java.util.Scanner;


public class stringOps {
    public static String printStr(String name){
        for(int i =0; i< name.length();i++){
            System.out.print(name.charAt(i)+ " ");
        }
        
        return name;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String Fname = sc.nextLine();
        String Sname = sc.nextLine();

        String name = Fname + Sname;
        printStr(name);
        System.out.println(name.length());
    }
}
