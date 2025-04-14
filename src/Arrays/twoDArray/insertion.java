package Arrays.twoDArray;

import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Element at [" + i + " ][" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }

        //insertion logic
          int rowpos = sc.nextInt();
        int colpos = sc.nextInt();
        int value =  sc.nextInt();
        if(rowpos>=0 && rowpos < row && colpos>=0 && colpos<col){
            arr[rowpos][colpos] = value;
            System.out.println("Value inserted succesfully");

    }else {
            System.out.println("wrong position");
}
        //print2d Array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}


