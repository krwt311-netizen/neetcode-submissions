class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int n = piles.length;
      int left = 1 ;
      int right = 0;
      for(int pile : piles){
        right = Math.max(pile , right);    
      }
      while(left<right){
        int mid = (right+left)/2;
        if(totalhours(mid,piles)<=h){
            right = mid;
        }
        else{
            left = mid+1;
        }
      }
        return left;
      
    }
      public long totalhours(int k , int [] piles){
        int hours = 0 ;
        for(int pile : piles){
        hours = hours + (pile + k - 1)/k;
      }
      return hours;
}
}

