package stacks.queues.java;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class MyMergeSortTest {

    @Test
    @DisplayName("merge halves")
    public void mergeHalves(){
        int[] array = {3, 9, 8, 10};
        int[] temp = new int[4];
        MyMergeSort.mergeHalves(array, temp, 0, 3);
        assertEquals(array[0], 3);
        assertEquals(array[1], 8);
        assertEquals(array[2], 9);
        assertEquals(array[3], 10);
    }

    @Test
    @DisplayName("sort already sorted")
    public void sortAlreadySorted(){
        int[] array = {3, 4, 5, 6};
        int[] sorted = MyMergeSort.mergesort(array);
        assertEquals(sorted[0], 3);
        assertEquals(sorted[1], 4);
        assertEquals(sorted[2], 5);
        assertEquals(sorted[3], 6);
    }

    @Test
    @DisplayName("sort from reversed")
    public void sortFromReversed(){
        int[] array = {6,5,4,3};
        int[] sorted = MyMergeSort.mergesort(array);
        assertEquals(sorted[0], 3);
        assertEquals(sorted[1], 4);
        assertEquals(sorted[2], 5);
        assertEquals(sorted[3], 6);
    }
}
