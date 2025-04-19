package Arrays.twoDArray;

public class MaximumSumSubArray {
    public static void main(String[] args) {
      int arr[][] =  {
            {2, 4, 6, 8, 4},
        {4, 5, 6, 7, 8},
        {2, 1, 9, 8, 4},
        {1, 2, 0, 3, 4}

    };
maximumSumSubArray(arr);
    }
    public static void maximumSumSubArray(int arr[][]){
        int max = Integer.MIN_VALUE;
        int resIndex = -1;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for (int j = 0;j<arr[i].length;j++){
                sum = sum + arr[i][j];
            }
            if(sum > max){
                max = sum;
                resIndex = i;
            }
        }
        System.out.println("Maximum sum SubArray is : " + max + " of the index " + resIndex);
    }
}
