public class stringCompression {

    public static String compression(String str) {

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            int count = 1;
            while ( i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1) ){
                count++;
                i++;
            }
            sb.append(current);
            if(count > 1){
                sb.append(count);
            }
            
            // sb.append(str.charAt(i)+count);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("java");
        String str = "aaaabbbdcccconkarsshhiinnddee";
        String result = compression(str);
        System.out.println(result);

    }
}
