

public class fisrtOccurence {
    public static int isfisrtOccurence(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
        return isfisrtOccurence(arr, key, i+1);
    }

    public static int islastOccurence(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        int found=islastOccurence(arr, key, i+1);
        if(found==-1 && arr[i]==key){
            return i;
        }
        
        return found;
    }
    public static void main(String arg[]){
        int arr[]={1,8,4,6,3,8,9,2,4,6,7};
        System.out.println(islastOccurence(arr,6,0));

    }
}
