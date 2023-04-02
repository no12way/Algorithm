package sorttype;

public class Bubble {
    /**
     * 对数组a中的元素进行排序
     * @param a
     */
    public static void sort(Comparable[] a){
        for (int i = a.length-1;i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (compare(a[j],a[j+1])){
                    exchange(a,j,j+1);}
                }
        }
    }

    /**
     * 比较元素t,v的大小
     * @param t
     * @param v
     * @return
     */
    public static boolean compare(Comparable t, Comparable v){
        return t.compareTo(v)>0;
    }

    /**
     * 将元素t,v交换位置
     * @param a
     * @param t
     * @param v
     */
    public static void exchange(Comparable[] a,int t,int v){
        Comparable temp = a[t];
        a[t] = a[v];
        a[v] = temp;
    }
}
