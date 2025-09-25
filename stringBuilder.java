public class stringBuilder {
    public static void main(String [] args){
        int sum = 0;
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb = sb.append(ch);
            System.out.println(sb.toString()+" => "+ sb.length()) ;
            sum += sb.length();
        }
        System.out.println(" the total sum of chars is "+sum);
    }
}
