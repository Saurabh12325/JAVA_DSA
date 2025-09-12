package JumpSearch;

public class JumpSearch {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8,9,10,11};
        int index = jump(arr,7);
        if(index == -1){
            System.out.println("not found at any index");
        }
        else{
            System.out.println("Element found at any index " + index);
        }
    }
    public static int jump(int arr[],int target){
        int n = arr.length;
        int startIndex = 0;
        int blocksize = (int) Math.sqrt(n);
        int endIndex = blocksize;
        if(endIndex<n && arr[endIndex]<=target){
            startIndex = endIndex;
            endIndex +=blocksize;

            if(endIndex>n){
                endIndex=n;
            }
        }
        int res = -1;
    }
}
