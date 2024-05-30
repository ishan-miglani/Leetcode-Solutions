class Solution {
    public String compressedString(String word) {
        String comp = "";
        int count = 0;
        for(int i=0;i<word.length();i++) {
            char ch = word.charAt(i);
            count++;
            if(i < word.length()-1 && ch == word.charAt(i+1)) {
                if(count == 9) {
                    comp += String.valueOf(count) + ch;
                    count=0;
                }
                continue;
            }
            else {
                comp += String.valueOf(count) + ch;
                count=0;
            }
        }
        return comp;
    }
}