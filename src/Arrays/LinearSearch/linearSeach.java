package Arrays.LinearSearch;

public class linearSeach {
    public static void main(String[] args)  {
        int arr[] = {2,1,5,6,8};
       linearSearch(arr,9);
    }
    public static void linearSearch(int arr[] ,int target){
        int ans = -1;
       for(int i = 0;i<arr.length;i++){
           if(arr[i] == target){
             ans = i;
             break;
           }
       }
        if (ans == -1) {
            System.out.println("no element present in the array");
        }
        System.out.println("Element is search at postion : " + ans);

    }
}
