package mergesort;

/**
 * 关于归并排序
 */
public class MergeSort {
    private static Comparable[] assist;
    //这里是对外的排序调用

    /**
     * 通过mergeSort进行排序
     * @param a
     */
    public static void mergeSort(Comparable[] a){
        //用一个辅助数组进行排序并且接收,作为临时空间,再把元素全注入到原数组中
        assist = new Comparable[a.length];
        //low表示数组的开始索引
        int low = 0;
        //max表示数组的最大索引
        int max = a.length - 1;
        //实现排序的主要函数
        sort(a,low,max);
    }

    /**
     * 这里实现归并排序,在mergeSort中被调用
     * @param a
     * @param low
     * @param max
     */
    public static void sort(Comparable[] a,int low,int max){
        //当最小索引和最大索引相等时,代表数组已经拆分成一个一个的单个元素,此时不再递归
        if(low == max){
            return;
        }
        //定义mid表示数组的中间索引(不均匀时,偏向low索引)
        int mid = low + (max-low)/2;
        //把分好的左边的数组进行再次拆分
        sort(a, low, mid);
        //把分好的右边的数组进行拆分
        sort(a,mid+1,max);
        //把同一趟拆分完的数组进行有序合并
        merge(a,low,mid,max);
    }

    /**
     * 通过merge函数,对数组进行合并
     * @param a
     * @param low
     * @param mid
     * @param max
     */
    public static void merge(Comparable[] a,int low,int mid,int max){
        //这里的p表示,辅助数组的最小索引
        int p = low;
        //表示要合并的左段数组的最小索引
        int p1 = low;
        //因为分成两段,low-mid一段,mid+1到max一段,p2表示后一段数组的最小索引
        int p2 = mid+1;
        //一直合并
        while (true){
            //当p1,和p2都未走完的时候,p1索引和p2索引的值比较大小,并且把小的注入到辅助数组中
            while (p1 <= mid && p2 <= max){
                if(greater(a[p1],a[p2])){
                    assist[p++] = a[p2++];
                }else {
                    assist[p++] = a[p1++];
                }
            }
            //当p2走完,p1没走完的时候,把p1依次注入到辅助数组中
            while (p1 <= mid){
                assist[p++] = a[p1++];
            }
            //当p2走完,p1没走完的时候,把p1依次注入到辅助数组中
            while (p2 <= max){
                assist[p++] = a[p2++];
            }
            //再把辅助数组中的数据注入到原数组中
            for ( int i = low; i <= max; i++){
                a[i] = assist[i];
            }
            //这些都执行完后,跳出方法
            break;
        }
    }
    /**
     * 比较t,v的大小
     * @param t
     * @param v
     */
    public static boolean greater(Comparable t,Comparable v){
        return  t.compareTo(v) > 0;
    }

    /**
     * 对数组中t,v索引的值进行交换
     * @param a
     * @param t
     * @param v
     */
    public static void exchange(Comparable[] a,int t, int v){
        Comparable temp ;
        temp = a[t];
        a[t] = a[v];
        a[v] = temp ;

    }
}
