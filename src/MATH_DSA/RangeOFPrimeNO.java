package MATH_DSA;

public class RangeOFPrimeNO {
    public static void main(String[] args) {
        primenum(35);
    }

    public static void primenum(int num) {
        int[] arr = new int[num];
        int index = 0; // to track array insert position

        for (int i = 2; i <= num; i++) {
            int count = 0;

            // Check if i is prime
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            // Check if prime and divisible by num
            if (count == 2 && num % i == 0) {
                arr[index] = i;
                index++;
            }
        }

        // Print the primes found
        System.out.println("Prime numbers divisible by " + num + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
