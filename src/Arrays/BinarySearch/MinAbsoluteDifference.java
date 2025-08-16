package Arrays.BinarySearch;

public class MinAbsoluteDifference {
    public static void main(String[] args) {
   int arr[] = {2,4,8,13,17,19};
   minAbsolute(arr,1);
    }

    public static void minAbsolute(int arr[],int target){
        int ans = -1;
        int first = 0;
        int last = arr.length-1;
        while (first<=last){
            int mid = first + (last-first)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            } else if (arr[mid]<target) {
                first = mid+1;

            }else {
                last = mid-1;
            }
        }
        int res = 0;
        if(ans == -1){
            if(last == -1){
                res = Math.abs(target - arr[first]);
            } else if (first == arr.length) {
                res = Math.abs(target - arr[last]);
            }else {
                int ans1 = Math.abs(target - arr[first]);
                int ans2 = Math.abs(target - arr[last]);
                res = ans1>ans2?ans1:ans2;
            } 
        }
        System.out.println("Minimum Absolute Difference is " + res);
    }

}
