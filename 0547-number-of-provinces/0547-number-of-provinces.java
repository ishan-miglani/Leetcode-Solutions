class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean visited[] = new boolean[isConnected.length];
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        stack.push(0);
        while(!stack.isEmpty()) {
            int city = stack.pop();
            visited[city] = true;
            for(int i = 0;i<isConnected[city].length;i++) { 
                if(!visited[i] && isConnected[city][i] == 1) {
                    stack.push(i);
                }
            }
            if(stack.isEmpty()) {
                ans++;
                for(int i = 0;i<visited.length;i++) {
                    if(visited[i] == false)
                    {
                        stack.push(i);
                        break;
                    }
                }
            }
        }
        if(!stack.isEmpty())
            ans+=1;
        return ans;
    }
}
/*
Strongly connected components ?
disjointed dfs ?
pick 1 node - see all possible visits including from neighbours
if some still remain unvisited then start new province
*/