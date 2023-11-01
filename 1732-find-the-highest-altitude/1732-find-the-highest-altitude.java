class Solution {
    public int largestAltitude(int[] gain) {
        int pre[] = new int[gain.length];
        pre[0] = gain[0];
        int ans = Math.max(0,pre[0]);
        for(int i=1;i<gain.length;i++) {
            pre[i] = pre[i-1]+gain[i];
            ans = Math.max(ans,pre[i]);
        }
        return ans;
    }
}