class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length-1;
        int ans = 0;
        while(start<=end){
               int  area = (Math.min(heights[start], heights[end] ) * (end - start));
               ans = Math.max(area , ans);
                if(heights[start]<heights[end]){
                    start = start +1 ;
                }
                else {
                    end = end - 1;
                }
        }
        return ans;

        }
    }

