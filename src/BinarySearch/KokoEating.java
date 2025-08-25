package BinarySearch;

public class KokoEating {

        public int minEatingSpeed(int[] piles, int h) {
            int start = 1;
            int end = Integer.MIN_VALUE;
            for(int i = 0; i < piles.length;i++){
                if(piles[i] > end){
                    end = piles[i];
                }
            }
            int ans = -1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(iskokoEatingBanana(piles,mid,h)){
                    ans = mid;
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }

            }
            return ans;
        }
        public static boolean iskokoEatingBanana(int piles[],int EatingSpeed,int hours){
            int hourSpent = 0;
            for(int i = 0; i<piles.length;i++){
                hourSpent += piles[i] / EatingSpeed;
                if(piles[i] % EatingSpeed != 0){
                    hourSpent+=1;
                }
                if(hourSpent>hours){
                    return false;
                }

            }
            return true;
        }
    }

