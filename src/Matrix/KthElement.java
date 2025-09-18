package Matrix;

class KthElement{
    public int kthSmallest(int[][] matrix, int k) {
        int R = matrix.length;
        int C = matrix[0].length;
        int n = R*C;
        int requiredIndex = k-1;
        int start = matrix[0][0];
        int end = matrix[R-1][C-1];
        while(start<=end){
            int assumedKthElement = start+(end-start)/2;
            int lesserElement = findthelesser(matrix , assumedKthElement);
            if(lesserElement<=requiredIndex){
                start = assumedKthElement+1;
            }
            else{
                end = assumedKthElement-1;
            }

        }
        return start;
    }
    public int findthelesser(int matrix[][],int assumedKthElement){
        int smallerElementCount = 0;
        for(int i=0;i<matrix.length;i++){
            int start = 0;
            int end = matrix[0].length-1;
            while(start<=end){
                int mid = start+(end - start)/2;
                if(matrix[i][mid]<=assumedKthElement){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            smallerElementCount += start;
        }
        return smallerElementCount;
    }

}