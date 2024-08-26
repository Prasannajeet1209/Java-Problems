package SortingAlgo;

import java.util.Arrays;
import java.util.Collections;

public class Insertionsort {
    public static  void sortArray(int number[]){
        for(int i=0;i<number.length;i++){
            int curr=number[i];
            int prev=i-1;
            while(prev>=0 && number[prev]>curr){
                number[prev+1]=number[prev];
                prev--;
            }
            number[prev+1]=curr;
        }
        
    }

     public static void printArray(Integer number[]) {
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        
     }
    public static void main(String[] args) {
        Integer number[]={19,8,7,16,5,14,3};
        Arrays.sort(number,Collections.reverseOrder());
      // sortArray(number);
       printArray(number);
    }
    
}
