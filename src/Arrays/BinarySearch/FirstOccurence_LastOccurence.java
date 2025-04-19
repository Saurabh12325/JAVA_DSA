package Arrays.BinarySearch;

public class FirstOccurence_LastOccurence {
    public static void main(String[] args) {
        int arr[] = {2,2,4,4,5,6,8};
        int res[] = new int[2];
        int first  = binarySearch(arr,4,true);
        int last  = binarySearch(arr,5,false);
        res[0] = first;
        res[1] = last;
      for (int i = 0;i< res.length;i++){
          System.out.print("["+ res[i] + "]");
      }
    }
    public static int binarySearch(int arr[] ,int target,boolean getPosition) {
       int ans = -1;
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
           int mid = first + (last-first)/2;
           if(arr[mid]== target) {
               ans = mid;
               if (getPosition) {
                   last = mid - 1;
               } else {
                   first = mid + 1;
               }
           }
               else if (arr[mid] < target){
                   first = mid + 1;
               }
               else {
                   last = mid-1;
               }


        }
        return ans;

    }
}
