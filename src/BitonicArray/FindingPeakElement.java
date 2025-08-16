package BitonicArray;

public class FindingPeakElement {

    public static int PeakElement(int[] arr){
        int n = arr.length;
        int first = 0;
        int last = n-1;
        while (first<=last){
            int mid = first +(last - first)/2;
            if(mid !=0 && mid != n-1 && arr[mid] >arr[mid+1] && arr[mid] > arr[mid-1]){
                return arr[mid];
            } else if (mid!=0 && arr[mid] < arr[mid +1]) {
                first = mid+1;

            }else {
                last = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {2,5,9,11,17,4,1};
        System.out.println("Peak Element == " + PeakElement(arr));
    }
}
