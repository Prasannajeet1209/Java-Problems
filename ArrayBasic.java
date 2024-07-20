

import java.util.*;

public class ArrayBasic {
    
        @SuppressWarnings("resource")
        public static void main(String[] args) {
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Element :");
        for (int i = 1; i <= 4; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array Element are : ");
        for (int i = 1; i <= 4; i++) {
        System.out.print(" " + arr[i]);
        }

    }
}
