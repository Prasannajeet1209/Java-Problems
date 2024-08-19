public class SubArray {
    public static void Subarray(int number[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i< number.length;i++){
           int start=i;
           for(int j=i;j< number.length;j++){
            int end =j;
            sum=0;
            for(int k=start;k<=end;k++){
                 sum+=number[k];   
             }
             System.out.println(sum);
             if(max<sum){
                max=sum;
             }
     
           }
           
        }
        System.out.println("Max sum of Sub Array are : "+max);
     }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        Subarray(number);
    }
} 
