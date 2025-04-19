package Arrays.LinearSearch;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 6, 8, 4},
                {4, 5, 6, 7, 8},
                {2, 1, 9, 8, 4},
                {1, 2, 0, 3, 4}

        };
        linearSearch2dArray(arr,4,false);
        linearSearch2dArray(arr,4,true);
    }

    public static void linearSearch2dArray(int arr[][],int target,boolean findLast){
        int outerIndex = -1;
        int innerIndex = -1;
        for(int i = 0;i< arr.length;i++){
            boolean found = false;
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    outerIndex = i;
                    innerIndex = j;
                    if(findLast == false){
                        found = true;
                        break;
                    }
                }
            }
            if(found == true){
                break;
            }
        }
        if(outerIndex == -1 && innerIndex == -1){
            System.out.println("No element found");
        }
        else {
            System.out.println("Element Found at " + outerIndex + "," + innerIndex);
        }
    }
}

