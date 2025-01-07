package TechM;

import java.util.Scanner;

public class NewArray {
    public static void merge(int arr[]) {
        int arr1[] = new int[arr.length];
        int j = 0;
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr1[j] = arr[i];
                j += 2;
            } else {
                arr1[k] = arr[i];
                k += 2;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(" " + arr1[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { -1, -2, 4, 3, -5 };
        merge(arr);
       
    }
}
