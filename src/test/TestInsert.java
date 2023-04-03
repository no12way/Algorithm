package test;

import insertsorting.InsertionSorting;

import java.util.Arrays;

public class TestInsert {
    public static void main(String[] args) {
        //对插入排序进行测试
        Integer[] integers = new Integer[]{1,5,23232,7,2312,435,89,10,93};
        InsertionSorting.insertSort(integers);
        System.out.println(Arrays.toString(integers));
    }
}
