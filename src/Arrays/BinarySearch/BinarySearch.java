package Arrays.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,5,6,8,9};
       binarySearch(arr,4);
    }
    public static void binarySearch(int arr[],int target){
        int start = 0;
        int end  = arr.length-1;
        int ans  = -1;
        while (start<=end){
            int mid  = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid+1;
            }else {
                end = mid-1;
            }

        }
        if(ans == -1){
            System.out.println("No element found in this array");
        }
        else {
            System.out.println(ans);
        }
    }
}
