package Arrays.twoDArray;

import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row =  sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the elements of the array");
        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print("Element at [" + i + " ][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        //print2d Array
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }


        }


