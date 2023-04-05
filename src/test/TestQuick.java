package test;

import quicksort.QuickSort;

import java.util.Arrays;

public class TestQuick {
    //对快速排序进行测试
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1,3213,5,7,23,2,6,9,1002,2888};
        QuickSort.quickSort(integers);
        System.out.println(Arrays.toString(integers));
    }
}
