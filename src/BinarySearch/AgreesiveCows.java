package BinarySearch;

import java.util.Arrays;

public class AgreesiveCows {

        public int aggressiveCows(int[] stalls, int cows) {
            int n = stalls.length;
            int ans = -1;
            if(n<cows){
                return  -1;
            }
            Arrays.sort(stalls);
            int start = 1;
            int end = stalls[n-1] - stalls[0];
            while(start <= end){
                int mid = start + (end-start)/2;
                if(isCowsAllocationPossible(stalls,mid,cows)){
                    ans = mid;
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }

            }
            return ans;

        }
        public static boolean isCowsAllocationPossible(int stalls[], int MinDistance,int cows){

            int cowCount = 1;
            int lastCowDistance = stalls[0];


            for(int i = 1;i<stalls.length;i++){
                //check if the mini distance is maintained
                if(stalls[i] - lastCowDistance >= MinDistance){
                    cowCount += 1;
                    lastCowDistance = stalls[i];
                }
                if(cowCount>=cows){
                    return true;
                }
            }
            return false;
        }

    }

