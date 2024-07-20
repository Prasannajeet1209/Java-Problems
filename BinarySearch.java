public class BinarySearch {


     public static int binarySearch(int Number[],int key){
            int start=0,end=Number.length-1;
            while(start<=end){
                int mid= (start + end) / 2;
                if(Number[mid]==key){
                    return mid;
                }
                if(Number[mid]<key){
                    start=mid+1;
                }else{
                    end=mid-1;
                }

            }
         return -1;
     }
    public static void main(String[] args) {
        int Number[] = {1,2,3,4,16,18,19,20,23,26 };
        int key = 12;
        System.out.println("Element Present at Index :" + binarySearch(Number,key));

    }
}

