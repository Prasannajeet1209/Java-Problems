public class sortArray {

    public static void sort(int number[]){
        int start=0;
        int end = number.length-1;
        for(int i=0;i<=end;i++){
            int temp=number[end];
            number[end]=number[start];
            number[start]=temp;
            start++;
            end--;

        }
        
    }
    public static void main(String[] args) {
        int number[] = { 1, 4, 6, 8, 10, 14 };
        System.out.println("Revered Array is : ");
        sort(number);
        for(int i=0;i<=number.length-1;i++){
            System.out.print(number[i]+" ");
            
        }
       
    }
}
