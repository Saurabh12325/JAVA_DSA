package Arrays.LinearSearch;

public class MultipleOccurence {
    public static void main(String[] args) {
       int arr[] = {2,4,2,8,9,9,2};
       multipleoccurence(arr,9);

    }
    public static void multipleoccurence(int arr[],int target){
        int ans[] = new int[arr.length];
         int k = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                ans[k] = i;
                k++;
            }
        }
        if(k == 0){
            System.out.println("Element is not present in the array");
        }else {
            for (int i = 0;i<k;i++){
                System.out.println("element found at position " + ans[i]);
            }
        }
    }
}
