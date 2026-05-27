// Last updated: 5/27/2026, 12:34:54 PM
class MedianFinder {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    public MedianFinder() {
        left = new PriorityQueue<>();
        right = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        right.offer(num);
        left.offer(right.poll());

        if(right.size() < left.size()){
            right.offer(left.poll());
        }
    }
    
    public double findMedian() {
        if(left.size() == right.size()){
            return (right.peek() + left.peek()) / 2.0;
        }
        return right.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */