public class Diamond {

    public static void diamind(int n){
        for(int i = 1; i<=n;i++){
            // space 
            for(int j = i;j<=n-1;j++){
                System.out.print(" ");
            }
            // star 
            for(int j = 1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i = n; i>=1;i--){
            // space 
            for(int j = i;j<=n-1;j++){
                System.out.print(" ");
            }
            // star 
            for(int j = 1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        diamind(8);
    }
}
