public class reversenum {
    public static void main(String[] args) {
       int n = 241104;
       
        while(n > 0){
            int lastdigit = n % 10;
            System.out.print(lastdigit );
            n /= 10;
        }
        System.out.println();
    }
}
