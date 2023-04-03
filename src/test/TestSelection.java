package test;

import selection.SelectionSort;

import java.util.Arrays;

public class TestSelection {
    //对选择排序进行测试
    public static void main(String[] args) {
        Integer[] a = new Integer[]{99,1,3,5,6,2,88,1,8};
        SelectionSort.selection(a);
        System.out.println(Arrays.toString(a));
    }
}
