package stacks.queues.java;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MyQuickSortTest {
    @Test
    @DisplayName("can partition on a pivot")
    public void canPartition(){
        int[] array = {6,5,4,3};
        int partition = MyQuickSort.partition(array, 0, 3, 5);
        assertEquals(partition, 2);
    }

    @Test
    @DisplayName("sort already sorted")
    public void sortAlreadySorted(){
        int[] array = {3, 4, 5, 6};
        int[] sorted = MyQuickSort.quicksort(array);
        assertEquals(sorted[0], 3);
        assertEquals(sorted[1], 4);
        assertEquals(sorted[2], 5);
        assertEquals(sorted[3], 6);
    }

    @Test
    @DisplayName("sort from reversed")
    public void sortFromReversed(){
        int[] array = {6,5,4,3};
        int[] sorted = MyQuickSort.quicksort(array);
        assertEquals(sorted[0], 3);
        assertEquals(sorted[1], 4);
        assertEquals(sorted[2], 5);
        assertEquals(sorted[3], 6);
    }
}
