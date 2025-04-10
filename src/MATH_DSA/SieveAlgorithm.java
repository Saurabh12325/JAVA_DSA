package MATH_DSA;

import java.util.Arrays;

public class SieveAlgorithm {
    public static void main(String[] args) {
           SieveAlgo(10);
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

}
