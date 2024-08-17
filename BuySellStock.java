public class BuySellStock {



    public static int Trading(int prices[]){
         int buy=Integer.MAX_VALUE;
         int maxProft=0;
         for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
            int profit=prices[i]-buy;
            maxProft=Math.max(maxProft, profit); 
         }else{
            buy=prices[i];
         }
        }
        return maxProft;
    }
     public static void main(String arg[]){
        int prices[] ={1,4,5,8,11,16};
        
        System.err.println("Max Profit is equal to : "+Trading(prices));
     }
}
