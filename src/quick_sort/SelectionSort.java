package quick_sort;

/**
 * 关于快速排序的算法
 */
public class SelectionSort {
    /**
     * 快速排序方法
     * @param a
     */
    //可知时间复杂度为n平方,不适合数据量大的排序
    public static void  selection(Comparable[] a){
        for (int i = 0; i < a.length-1; i++) {
            int min = i;//每次遍历把最小的值放到索引为i的为hi
            for (int j = i+1 ; j <= a.length - 1; j++) {//遍历i后的每个元素,包括最后一个,只要比i小就放到
                //下标为i的位置
                if(compare(a[min],a[j])){//比较相邻两个元素的大小,小的放前面
                    exchange(a,min,j);
                }
            }
        }
    }
    /**
     * 比较元素的大小
     * @param t
     * @param v
     * @return
     */
    public static boolean compare(Comparable t,Comparable v){
        return t.compareTo(v) > 0 ;
    }

    /**
     * 交换元素的位置
     * @param a
     * @param t
     * @param v
     */
    public static void exchange(Comparable[] a,int t, int v){
        Comparable temp;
        temp = a[t];
        a[t] = a[v];
        a[v] = temp;
    }
}
