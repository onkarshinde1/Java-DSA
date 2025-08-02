public class pyramid {

    public static void pyramid(){
        for(int i = 1;i<=5;i++){
            for(int j = i;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid();
    }
}
