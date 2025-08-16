package Arrays.BinarySearch;

public class CountOccurence {
    public static void main(String[] args) {
        int arr[] = {2,2,4,4,8,8,8,9};

      int first= countOccurece(arr,8,true);
        int last = countOccurece(arr,8,false);
     if(first == -1){
         System.out.println("Occurence of the target value is " + "0");
     }
      else {
         System.out.println("Occurence of the target value is " + (last-first+1));
     }
    }
    public static int countOccurece(int[] arr, int target, boolean isFirst){
        int first = 0;
        int last  = arr.length-1;
        int ans = -1;
         while (first<=last){
            int mid = first +(last-first)/2;
            if(arr[mid] == target){
                ans = mid;
                if(isFirst){
                    last = mid-1;
                }else {
                    first = mid + 1;
                }
            }
            else if(arr[mid] < target){
                first = mid +1;
            }
            else {
                last = mid -1;
            }
        }
        return ans;
    }
}

