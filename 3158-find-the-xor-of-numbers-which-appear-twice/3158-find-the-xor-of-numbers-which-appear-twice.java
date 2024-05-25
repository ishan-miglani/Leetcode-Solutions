class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> dup = new ArrayList<Integer>();
        int ans = 0;
        for(int n:nums) {
            if(set.contains(n)) {
                dup.add(n);
            }
            set.add(n);
        }
        for(int d:dup) {
            if(ans ==0)
                ans = d;
            else
                ans = ans ^ d;
        }
        return ans;
    }
}