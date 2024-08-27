package SortingAlgo;

public class SelectionSort {
    
        public static  void sortArray(int number[]){
              for(int i=0;i<number.length-1;i++){
                int min=i;
                  for(int j=i+1;j<number.length;j++){
                      if(number[min]>number[j]){
                        min=j;  
                      }   
                  }
                  int temp =number[min];
                  number[min]=number[i];
                  number[i]=temp;
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
