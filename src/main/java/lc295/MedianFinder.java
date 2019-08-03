package lc295;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author jinsihou
 */
public class MedianFinder {
    private int count = 0;
    private PriorityQueue<Integer> min = new PriorityQueue<>();
    private PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());

    public MedianFinder() {

    }

    public void addNum(int value) {
        count ++;
        if (max.size() == 0) {
            max.offer(value);
            return;
        }
        if (max.size() >= min.size()) {
            if (value < max.peek()) {
                min.offer(max.poll());
                max.offer(value);
            } else {
                min.offer(value);
            }
        } else {
            if (value >= min.peek()) {
                max.offer(min.poll());
                min.offer(value);
            } else {
                max.offer(value);
            }

        }
    }

    public double findMedian() {
        if (count % 2 == 0){
            return (min.peek() + max.peek()) / 2.0;
        } else {
            return min.size() >= max.size() ? min.peek() : max.peek();
        }
    }

    public static void main(String[] args) {
        MedianFinder obj = new MedianFinder();
        obj.addNum(1);
        obj.addNum(2);
        obj.findMedian(); // -> 1.5
        obj.addNum(3);
        obj.findMedian(); // -> 2
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */