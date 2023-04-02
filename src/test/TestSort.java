package test;

import sorttype.Bubble;


public class TestSort {
    public static void main(String[] args) {
        Integer[] arry = new Integer[]{5,4,9,12,1,8};
        Bubble.sort(arry);
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+" ");
        }
        //分析得知,代码执行规模为
        // 外层执行(n-1)次,内层执行n次,一共为n(n-1)=n平方-n
        //时间复杂度为n平方
        //快速排序不适合大内存数组排序
    }
}
