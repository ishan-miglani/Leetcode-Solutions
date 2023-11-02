class RecentCounter {
    LinkedList<Integer> q;
    public RecentCounter() {
        this.q = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        this.q.addLast(t);
        while(this.q.getFirst() < t-3000)
            this.q.removeFirst();
        return this.q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */