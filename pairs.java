public class pairs {

    public static void pairs(int arr[]){
        int tp =0;
        for(int i = 0; i<arr.length;i++){
            int curr = arr[i];
            for(int j = i+1;j<arr.length;j++){
                System.out.print("("+ curr +","+arr[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs are "+tp);
    }

    public static void main(String args[]){
        int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
        
        pairs(arr);
        
    }
}


