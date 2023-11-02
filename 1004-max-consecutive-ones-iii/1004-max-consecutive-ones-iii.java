class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0,right = 0, zeroes = 0,ans= 0;
        int n = nums.length;
        
        while(right<n){
            if(nums[right] == 0) {
                if(zeroes<k) {
                    zeroes++;
                    right++;
                }else {
                    while(zeroes>=k) {
                        if(nums[left] == 0)
                            zeroes--;
                        left++;
                    }
                }
            }else {
                right++;
            }
            ans = Math.max(ans,right-left);
         }
        return ans;
    }
}