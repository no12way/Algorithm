package test;

import hillsorting.HillSorting;

import java.util.Arrays;

public class TestHill {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1,6,3,7,232,5654,12312,111,26,75,12};
        HillSorting.hillSorting(integers);
        System.out.println(Arrays.toString(integers));
    }
}
