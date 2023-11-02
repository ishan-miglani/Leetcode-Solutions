class Solution {
    String Vowels = "aeiou";
    public int maxVowels(String s, int k) {
        int i = 0,j = 0;
        int ans = 0;
        int temp = 0;
        for(j = 0;j<i+k;j++) {
            if(Vowels.indexOf(s.charAt(j)) != -1){
                temp++;
                ans = Math.max(ans,temp);
            }
        }
        j--;
        while(j+1< s.length()) {
            if(Vowels.indexOf(s.charAt(i)) != -1){
                 temp--;
            }
            i++;j++;
            if(Vowels.indexOf(s.charAt(j)) != -1){
                temp++;
            }
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}