package Matrix;

public class MedianRowWise {

        public int median(int matrix[][]){
            int n = matrix.length;
            int m = matrix[0].length;
            int N = n*m;
            int medianIndex = N/2;
            int start = 1;
            int end = 2000;
            while(start<=end){
                int assumedMedian = start+(end - start)/2;
                int lesserElement = findsmallerElement(matrix,assumedMedian);
                if(lesserElement <=medianIndex){
                    start = assumedMedian+1;
                }
                else{
                    end = assumedMedian-1;
                }
            }
            return start;
        }
        int findsmallerElement(int matrix[][], int assumedMedian){
            int noOfSmallerElement = 0;
            for(int i = 0;i<matrix.length;i++){
                int start = 0;
                int end = matrix[i].length-1;
                while(start <=end){
                    int mid = start+(end-start)/2;
                    if(matrix[i][mid] <= assumedMedian){
                        start = mid +1;
                    }
                    else{
                        end = mid -1;
                    }
                }
                noOfSmallerElement += start;
            }
            return  noOfSmallerElement;
        }

    }

