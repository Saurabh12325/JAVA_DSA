package Arrays.BinarySearch;

public class Floor_Ceil {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,7,9};
        int x = floor(arr,8);
        System.out.println("floor is "+ x);
        int y = ceil(arr,8);
        System.out.println("ceil is "+ y);
    }
    public static int floor(int arr[], int target){
        int first  = 0;
        int last  = arr.length-1;
        int ans = -1;
        while(first<=last){
            int mid = first + (last - first)/2;
            if(arr[mid] == target){
                ans = arr[mid];
            }
            else  if(arr[mid] > target){
                last = mid-1;
            }
            else {
                first  = mid+1;
                ans = arr[mid];
            }
        }
        return ans;
    }

    public static int ceil(int arr[], int target){
        int first  = 0;
        int last  = arr.length-1;
        int ans = -1;
        while(first<=last){
            int mid = first + (last - first)/2;
            if(arr[mid] == target){
                ans = arr[mid];

            }
            else  if(arr[mid] > target){
                last = mid-1;
                ans = arr[mid];
            }
            else {
                first  = mid+1;

            }
        }
        return ans;
    }
}


