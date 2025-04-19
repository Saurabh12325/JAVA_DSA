package Arrays.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,5,6,8,9};
        int arr2[] = {9,8,7,6,5};
//       binarySearch(arr,9);
//       binarySearchdec(arr2,9);
        binarySearchAgnostic(arr ,9);
        binarySearchAgnostic(arr2,9);

    }

    private static void binarySearchAgnostic(int[] arr2, int target) {
        int start = 0;
        int end = arr2.length-1;
        if(arr2[start] < arr2[end]){
            binarySearch(arr2,target);
        }else {
            binarySearchdec(arr2,target);
        }

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
            System.out.println(" element found at increasing " +  ans);
        }
    }

// when the array is in the decreasing order
    public static void binarySearchdec(int arr2[],int target){
        int start = 0;
        int end  = arr2.length-1;
        int ans  = -1;
        while (start<=end){
            int mid  = start + (end - start)/2;
            if(arr2[mid] == target){
                ans = mid;
                break;
            } else if (arr2[mid] < target) {
                end = mid-1;
            }else {
              start = mid +1;
            }

        }
        if(ans == -1){
            System.out.println("No element found in this array");
        }
        else {
            System.out.println(" element found at decreasing "+  ans);
        }
    }
}
