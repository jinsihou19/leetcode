package lc295;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianFinderTest {
    @Test
    public void testMain() {
        MedianFinder obj = new MedianFinder();
        obj.addNum(1);
        obj.addNum(2);
        assertEquals(obj.findMedian(), 1.5);
        obj.addNum(3);
        assertEquals(obj.findMedian(), 2);
    }
}
