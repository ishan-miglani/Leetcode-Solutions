class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0,right = 0, ans = 0;
        int n = nums.length;
        boolean delete = false;
        while(right< n && left<=right) {
            if(nums[right] == 1){
                ans = Math.max(ans, right - left);
                right++;
            }else{
                if(!delete){
                    delete = true;
                    ans = Math.max(ans, right - left);
                    right++;
                }
                else {
                    while(nums[left]!=0) 
                        left++;
                    delete = false;
                    left++;
                }
            }
        }
        return ans;
    }
}