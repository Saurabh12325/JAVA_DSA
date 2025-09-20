package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> result = new ArrayList<>();
            int n = matrix.length;
            int m = matrix[0].length;
            int startRow = 0;
            int endRow = n-1;
            int startCol = 0;
            int endCol = m-1;
            while(startRow <= endRow && startCol <= endCol){
                for(int j = startCol;j<=endCol;j++){
                    result.add(matrix[startRow][j]);
                }
                startRow+=1;
                for(int i = startRow;i<=endRow;i++){
                    result.add(matrix[i][endCol]);
                }
                endCol-=1;
                if(startRow <= endRow){
                    for(int j = endCol;j>=startCol;j--){
                        result.add(matrix[endRow][j]);
                    }
                    endRow-=1;
                }
                if(startCol <= endCol){
                    for(int i = endRow;i>=startRow;i--){
                        result.add(matrix[i][startCol]);
                    }
                    startCol+=1;
                }

            }
            return result;

        }
    }
}
