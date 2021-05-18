package stacks.queues.java;

public class MyQuickSort {

    public static int[] quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
        return array;
    }

    public static void quicksort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = array[(left + right) / 2];
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index - 1);
        quicksort(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot){
                right--;
            }

            if (left <= right){
                array[left] = (array[left] + array[right]) - (array[right] = array[left]);

                left++;
                right--;
            }
        }

        return left;
    }
}
