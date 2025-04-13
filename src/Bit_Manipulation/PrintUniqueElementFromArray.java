package Bit_Manipulation;

public class PrintUniqueElementFromArray {
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,3,6,1,6,1};
      System.out.print( printUniqueElement(arr));
    }
    public static int  printUniqueElement(int arr[]){
        int res = 0;
        for(int i = 0 ; i<arr.length;i++ ){
             res  = res ^ arr[i];
        }
        return res;
    }
}
