public class KadanesAlgorithm {


    public static void Kadane(int number[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            cs+=number[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("Max Sum of Sub Array is :"+ms);
    }
    public static void main(String[] args) {
        int number[]={1,-1,-3,-4,-2,-3,-1,-5,3};
        Kadane(number);
    }
}
