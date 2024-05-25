class Solution {
    /*
    Map 1 - count of colors and their frequency
    Map 2 - balls and their color
    */
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer,Integer> colors = new HashMap<>();
        Map<Integer,Integer> balls = new HashMap<>();
        int ans[] = new int[queries.length];
        int x=0;
        
        for(int i=0;i<queries.length;i++) {
            if(balls.containsKey(queries[i][0])) {
                //update color count of old color and add new color similarly
                int oldColor = balls.get(queries[i][0]);
                int count = colors.get(oldColor);
                if(count == 1)
                    colors.remove(oldColor);
                else{
                    colors.put(oldColor,count-1);
                }
                int newColor = queries[i][1];
                colors.put(newColor,colors.getOrDefault(newColor,0)+1);
                balls.put(queries[i][0],newColor);
                ans[x++]=colors.size();
            }else {
                balls.put(queries[i][0],queries[i][1]);
                colors.put(queries[i][1],colors.getOrDefault(queries[i][1],0)+1);
                ans[x++]=colors.size();
            }
        }
        return ans;
    }
}