package Arrays.MAXIMUM_MINIMUM;

public class Max_Min {
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,1,9};
       Maximum(arr);
       Minimum(arr);
    }
    public static void Maximum(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i< arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum value is " + max);
    }

    public static void Minimum(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum value is " + min);
    }
}
