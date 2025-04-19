package Arrays.LinearSearch;

public class MultipleOccurenceIn2DARRAY {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 6, 8, 4},
                {4, 5, 6, 7, 8},
                {2, 1, 9, 8, 4},
                {1, 2, 0, 3, 4}

        };
multipleOccurence(arr,4);
    }
    public static void multipleOccurence(int arr[][],int target){
        int size = 0;
        for (int i = 0;i< arr.length;i++){
            size = size +arr[i].length;
        }
        int ans[][] = new int[size][2];
        int k = 0;
        for (int i = 0 ;i<arr.length;i++){
            boolean found = false;
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    ans[k][0] = i;
                    ans[k][1] = j;
                    k++;
                }
            }
            if(found == true){
                break;
            }
        }
        if(k == 0){
            System.out.println("Element is not found in the array");
        }
        else {
         for (int i = 0; i<k;i++){
             System.out.println("Element Found At " + ans[i][0] + " ," + ans[i][1]);
         }
        }
    }
}
