class Solution {
    public int maxArea(int[] height) {
        
        int max = Integer.MIN_VALUE;

        int l = 0; 
        int r = height.length - 1; 

        while(l<= r) {
                max = Math.max(Math.min(height[l], height[r])*(r-l), max); 

                if(height[l] < height[r]) {
                        l++; 
                }else{
                        r--; 
                }
                
        }

        return max; 
    }
}