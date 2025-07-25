public class triangle01 {

    public static void triangle(int num){
        for (int line = 1; line <= num; line++) {
            for (int star = 1; star <=line; star++) {
                if((line + star) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        triangle(5);
    }
}
