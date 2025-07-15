public class loops {
    public static void main(String args[]) {
        // while loop
        System.out.println("WHILE LOOP");
        System.out.println("");
        int counter = 0;
        while(counter <= 100){
        System.out.println(counter + ": hello world..!!");
        counter++;
        }

        // for loop
        System.out.println("FOR LOOP");
        System.out.println("");
        for(int i = 0; i<=100;i++){
        System.out.println(i + ": hello world..!!");
        }

        // do while
        System.out.println("DO WHILE LOOP");
        System.out.println("");
        int counter1 = 0;
        do {
            System.out.println(counter1 + ": onkar shinde");
            counter1++;
        } while (counter1 <= 100);
    }
}
