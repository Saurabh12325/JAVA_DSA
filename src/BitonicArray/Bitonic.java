package BitonicArray;

public class Bitonic {
    public static boolean validateBitonic(int arr[]){
        int i = 0;
        int n = arr.length;

        // for increament to the peak element
        while(i<n-1){
            if(arr[i] < arr[i+1]){
                i++;
            }else {
                break;
            }
        }
        if(i == 0 || i == n-1){
            return false;
        }
        while(i<n-1){
            if(arr[i] > arr[i+1]){
                i++;
            }else {
                break;
            }
        }
        return (i == n-1);
    }
    public static void main(String[] args) {
        int arr [] = {0,3,2,1};
      System.out.println(validateBitonic(arr));
    }


}
