package test;

import mergesort.MergeSort;

import java.util.Arrays;

public class TestMerge {
    public static void main(String[] args) {
        //对归并排序进行测试
        Integer[] integers = new Integer[]{8,4,6,2,9,10,1};
        MergeSort.mergeSort(integers);
        System.out.println(Arrays.toString(integers));
    }
}
