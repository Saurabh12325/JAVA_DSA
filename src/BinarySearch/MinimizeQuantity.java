package BinarySearch;

public class MinimizeQuantity {

        public static int minimizedMaximum(int n, int[] quantities) {
            int start = 1;
            int end = Integer.MIN_VALUE;
            for(int i = 0; i<quantities.length;i++){
                if(quantities[i]>end){
                    end = quantities[i];
                }
            }
            int ans = -1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(isproductAllocated(quantities,mid,n)){
                    ans = mid;
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }

            }
            return ans;


        }
        public static boolean isproductAllocated(int quantities[], int maxProduct, int store){
            int storeCount = 0;
            for(int i = 0; i<quantities.length;i++){
                storeCount += quantities[i]/maxProduct;
                if(quantities[i] % maxProduct != 0){
                    storeCount += 1;
                }
                if(storeCount>store){
                    return false;
                }

            }
            return true;
        }
    }

