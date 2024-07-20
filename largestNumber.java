
import java.util.*;

public class largestNumber {

    public static int findLargest(int Number[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < Number.length; i++) {
            if (largest < Number[i]) {

                largest = Number[i];
            }

        }
        return largest;

    }
    public static void main(String[] args) {
        int Number[] = { 1, 4, 6, 18, 10, 14, 2, 6, 7 };
        System.out.println("Largest number is Array is :" + findLargest(Number));

    }
}
