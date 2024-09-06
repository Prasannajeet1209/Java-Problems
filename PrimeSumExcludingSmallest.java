import java.util.Arrays;

public class PrimeSumExcludingSmallest {

    public int findSumOfPrimes(int[] input1, int input2) {
        int minPrime = Integer.MAX_VALUE;
        int primeSum = 0;

        // Iterate through the array to find prime numbers and their sum
        for (int num : input1) {
            if (isPrime(num)) {
                primeSum += num;
                if (num < minPrime) {
                    minPrime = num;
                }
            }
        }

        // Exclude the smallest prime number from the sum
        if (minPrime != Integer.MAX_VALUE) {
            primeSum -= minPrime;
        } else {
            // If no prime number was found, find the sum of all numbers excluding the smallest number
            int minNum = Integer.MAX_VALUE;
            int totalSum = 0;

            for (int num : input1) {
                totalSum += num;
                if (num < minNum) {
                    minNum = num;
                }
            }

            return totalSum - minNum;
        }

        return primeSum;
    }

    // Helper function to check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeSumExcludingSmallest obj = new PrimeSumExcludingSmallest();
        int[] inputArray = {10, 41, 18, 50, 43, 31, 29, 25, 59, 67};
        int inputLength = inputArray.length;
        int result = obj.findSumOfPrimes(inputArray, inputLength);
        System.out.println("Output: " + result);
    }
}
