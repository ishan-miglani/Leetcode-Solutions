class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> keys = new Stack<>();
        boolean seen[] = new boolean[rooms.size()];
        keys.push(0);
        seen[0] = true;
        while(!keys.isEmpty()) {
            int curr = keys.pop();
            seen[curr] = true;
            for(int i : rooms.get(curr)){
                if(seen[i] != true){
                    keys.push(i);
                    seen[i] = true;
                }
            }
        }
        for(boolean b : seen) {
            if(b!=true)
                return false;
        }
        return true;
    }
}