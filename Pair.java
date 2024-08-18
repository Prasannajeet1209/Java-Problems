public class Pair {


     public static void printPair(int number[]){
        int tp=0;
        for(int i=0;i<number.length;i++){
            int curr=number[i];
            for(int j=i+1;j<number.length;j++){
                System.out.print("("+curr+","+number[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs are : "+tp);
    }



    public static void Subarray(int number[]){
        int tp=0;
        for(int i=0;i< number.length;i++){
           int start=i;
           for(int j=0;j< number.length;j++){
            int end =j;
            for(int k=start;k<end;k++){
                System.out.print(number[k]+" ");
             }
             System.out.println();
           }
        }
        System.out.println("Total number of Sub Array are : "+tp);
     }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12};
        Subarray(number);
    }
    
    
}
