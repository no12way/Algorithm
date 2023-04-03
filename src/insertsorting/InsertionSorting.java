package insertsorting;

public class InsertionSorting {
    /**
     * 对数组进行插入排序
     * @param a
     */
    //可知道,插入排序的时间复杂度也是n平方,不适合大量数据排序
    public static void insertSort(Comparable[] a){
        //插入排序认为第i个索引前的元素已经排序好,将之后的元素合理插入到前面的有序数组元素中
        for (int i = 1; i <= a.length-1; i++) {
            for (int j = i; j > 0 ; j--) {
                if(compare(a[j-1],a[j])){//如果前面的元素大于后面的元素,则交换位置
                    exchange(a,j-1,j);
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
