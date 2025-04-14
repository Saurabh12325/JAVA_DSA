package Arrays.oneDArray;

import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the element of the array ");
        for(int i  = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        deletion(arr,2);
        printArray(arr);

    }
    public static void printArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //deletion logic in the array
public static void deletion(int arr[],int pos){
        for(int i = pos;i<arr.length-1;i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = 0;
}
}
