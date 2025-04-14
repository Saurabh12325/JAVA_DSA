package Arrays.oneDArray;

import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("entered the element of the array");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
     printArray(arr);
        insertion(arr,0,4);
        printArray(arr);


    }
    //printing of the aray
    public static void printArray(int arr[]){
        System.out.println("You entered:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void insertion(int arr[],int pos, int element){
        int size = arr.length;
      if(pos<0 || pos>size-1){
          System.out.print("index out of bound error");
          return;
      }
      else {
          for (int i = size-2;i>=pos;i--){
              arr[i+1] = arr[i];
          }
          arr[pos] = element;
      }

    }
}
