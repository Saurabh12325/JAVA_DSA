package MATH_DSA;

import java.util.Arrays;

public class SieveAlgorithm {
    public static void main(String[] args) {
           SieveAlgo(100);

    }
    public static void SieveAlgo(int num){
        boolean arr[] = new  boolean[num+1];
        Arrays.fill(arr,true);
        int counter = 2;
        while (counter<=num) {
            if (arr[counter] == true) {
                for (int factor = counter+counter; factor <=num; factor += counter) {
                    arr[factor] = false;
                }
            }
            counter++;
        }
        //print arr

        for(int i = 2; i<= num;i++){
            System.out.println(i + "is" + arr[i]);
        }
    }
//


   //Another method using the Seive algorith
        public int countPrimes(int n) {
            if (n <= 2) return 0;

            boolean[] arr = new boolean[n];
            Arrays.fill(arr, true);

            arr[0] = arr[1] = false;

            int sqrt = (int) Math.sqrt(n);
            for (int i = 2; i <= sqrt; i++) {
                if (arr[i]) {
                    for (int j = i * i; j < n; j += i) {
                        arr[j] = false;
                    }
                }
            }

            int count = 0;
            for (int i = 2; i < n; i++) {
                if (arr[i]) {
                    count++;
                }
            }

            return count;
        }
    }


