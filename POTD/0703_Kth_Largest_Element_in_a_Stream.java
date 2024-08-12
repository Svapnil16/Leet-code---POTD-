class KthLargest {
    private PriorityQueue<Integer> q;
    private int size;

    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>(k);
        size = k;
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        q.offer(val);
        if (q.size() > size) {
            q.poll();
        }
        return q.peek();
    }
}
