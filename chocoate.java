package TechM;
import java.util.ArrayList;
public class chocoate {

    public static void reorder(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                list.add(arr[i]);
            }
           
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                list.add(arr[i]);
            }
           
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int arr[] = { 4,7,8,0,0,0,3,0,3};
        reorder(arr);
       
    }
}
