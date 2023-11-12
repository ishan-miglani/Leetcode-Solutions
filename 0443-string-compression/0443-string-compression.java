class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int res = 0;
        for(int i =0; i<n;) {
            int groupLength = 1;
            while(i+groupLength<n && chars[i] == chars[i + groupLength]) {
                groupLength++;
            }
            chars[res++] = chars[i];
            if(groupLength>1) {
                for(char c: Integer.toString(groupLength).toCharArray())
                    chars[res++]=c;
            }
            i+=groupLength;
        }
        return res;
    }
}