class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> s = new Stack<>();
        s.push(asteroids[0]);
        for(int i = 1;i<asteroids.length;i++) {
            if(asteroids[i] < 0) {
                if(!s.isEmpty() && s.peek() < 0){
                    s.push(asteroids[i]);
                    continue;
                }
                while(!s.isEmpty() && s.peek() > 0 
                   && Math.abs(s.peek()) < Math.abs(asteroids[i])) {
                    s.pop();
                }
                if(!s.isEmpty() && s.peek() > 0 
                   && Math.abs(s.peek()) > Math.abs(asteroids[i])) {
                    continue;
                }
                if(!s.isEmpty() && s.peek() > 0 
                   && Math.abs(s.peek()) == Math.abs(asteroids[i])) {
                    s.pop();
                    continue;
                }
                s.push(asteroids[i]);
            }else {
                s.push(asteroids[i]);
            }
        }
        int ans [] = new int[s.size()];
        while(!s.isEmpty()) {
            ans[s.size() - 1] = s.pop();
        }
        return ans;
    }
}