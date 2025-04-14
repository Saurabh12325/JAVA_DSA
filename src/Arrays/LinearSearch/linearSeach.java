package Arrays.LinearSearch;

public class linearSeach {
    public static void main(String[] args)  {
        int arr[] = {2,2,1,5,6,8,2};
       linearSearch(arr,2,false);
        linearSearch(arr,2,true);
    }
    public static void linearSearch(int arr[] ,int target,boolean findlast){
        int ans = -1;
       for(int i = 0;i<arr.length;i++){
           if(arr[i] == target){
             ans = i;
             if (findlast == false){  //toh pehli baar milne par hi loop break kar do — yeh first occurrence dikhata hai.
                 break;
             }
           }
       }
        if (ans == -1) {
            System.out.println("no element present in the array");
        }
        System.out.println("Element is search at postion : " + ans);

    }
}
