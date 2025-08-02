public class charPyramid {
    public static void main(String[] args) {
        int n = 5;
        char chars = 65;

        for(int i = 1; i<=n ;i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(chars);
                chars++;
            }
            System.out.println("");
        }
    }
}
