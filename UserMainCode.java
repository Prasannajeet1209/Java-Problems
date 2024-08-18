import java.io.*;
import java.util.*;

class UserMainCode {
    public static char[] placeTheAlphabets(int[] input1) {
        int[] sortedInput = input1.clone();
        Arrays.sort(sortedInput);
        char[] result = new char[input1.length];
        
        for (int i = 0; i < sortedInput.length; i++) {
            int index = findIndex(input1, sortedInput[i]);
            result[index] = (char) ('a' + i);
        }
        
        return result;
    }

    private static int findIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(Arrays.toString(placeTheAlphabets(new int[]{10, 5, 70, 1}))); // Output: [c, b, d, a]
        System.out.println(Arrays.toString(placeTheAlphabets(new int[]{4, 5, -2, 8, 99, 67}))); // Output: [b, c, a, d, f, e]
        System.out.println(Arrays.toString(placeTheAlphabets(new int[]{45, -28, 99, 67}))); // Output: [c, a, d, b]
    }
}
