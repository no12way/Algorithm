package hillsorting;

public class HillSorting {
    /**
     *希尔排序
     * @param a
     */
    //希尔排序会选取步长,根据步长将同组的数据进行有序排列
    //然后不断的有规律的缩减步长,最后步长一定为1,重复排序
    //查阅资料,希尔排序不稳定,复杂度在n到n平方之间
    //虽然不稳定,但是在大数据量排序时候,时间缩减相对明显
    public static void hillSorting(Comparable[] a){
        int h = 1;//h为步长
        while (h < a.length/2){ h = 2*h+1 ;}//算出最长步长
        while (h >=1){
            for (int i = h ; i <= a.length-1 ; i++ ) {//对所在的组内进行插入排序
             for (int j = i; j-h >= 0 ;j-= h) {//j-h大于等于0就不会出现数组越界
                if(compare(a[j-h],a[j])){
                    exchange(a,j-h,j);
                    }
                }
            }//两个for循环后,步长为h的分组排序结束
            h = h/2;//缩短步长,在while循环里反复操作,直至跳出
        }
    }

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
