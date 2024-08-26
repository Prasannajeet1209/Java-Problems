package SortingAlgo;

public class Bubblesort {
  public static  void sortArray(int number[]){
        for(int i=0;i<number.length;i++){
            for(int j=0;j<number.length-i-1;j++){
                if(number[j]>number[j+1]){
                    int temp =number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                }
            }
        }
        
    }

     public static void printArray(int number[]) {
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        
     }
    public static void main(String[] args) {
        int number[]={19,8,7,16,5,14,3};
       sortArray(number);
       printArray(number);
    }
}
