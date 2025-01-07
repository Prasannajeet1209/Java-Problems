package TechM;

import java.util.*;

public class Array {

  public static void printArray(int arr[]) {
    System.out.print("Array Element are : ");
    for (int i = 1; i <= 4; i++) {
      System.out.print(" " + arr[i]);
    }
  }


  

  public static void InputArray() {
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array Element :");
    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();
    }
    // findElement(arr,10 );
    // System.out.println("Maximum = "+maxArray(arr)+" Minimum = "+minArray(arr));
    // System.out.println(secondMax(arr));
   // removeDuplication(arr);
  //  swap(arr, 0, 1);
  //  printArray(arr);
  //  swap(arr, 2, 3);
  //  printArray(arr);
  mixArray(arr);
  }



  public static void mixArray(int arr[]){
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
      if(i%2!=0 && arr[i]<0){
        list.add(arr[i]);
      }
    }
    System.out.println(list);
  }

  public static int maxArray(int arr[]) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  public static int minArray(int arr[]) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  public static int secondMax(int arr[]) {
    int max = Integer.MIN_VALUE;
    int secmax = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secmax = max;
        max = arr[i];
      } else if (arr[i] > secmax) {
        secmax = arr[i];
      }
    }
    return secmax;
  }


  public static void removeDuplication(int arr[]){
      Arrays.sort(arr);
      int arr1[] = new int[10];
    for(int i=0;i<5;i++){
        if(arr[i]==arr[i+1]){
            arr1[i]=arr[i];
        }else{
          arr1[i]=arr[i];
        }
    }
    printArray(arr1);
  }
  


  public static void swap(int arr[],int i,int j){
    while(i<j){
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
  }
  public static int findElement(int arr[], int element) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == element) {
        System.out.println("index = " + i);
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    InputArray();

  }
}
