

import java.util.*;
public class LinearSearch {
    
    public static int LinearSearchKey(int Number[],int key){
        for(int i=0;i<Number.length;i++){
            if(Number[i]==key){
                return i;
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        int Number[]={2,4,6,8,10,12,14,16};
        int key=10;
        int result= LinearSearchKey(Number,key);
        if(result==-1){
            System.out.println("NO KEY FOUND");
        }else{
            System.out.println("Key is present at : "+result);
        }
    }
}
