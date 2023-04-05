package quicksort;

public class QuickSort {
    /**
     * 这是关于快速排序的函数功能
     * @param a
     */
    public  static void quickSort(Comparable[] a){
        //low表示数组的开始索引
        int low = 0;
        //max表示数组的最大索引
        int max = a.length - 1;
        //调用sort
        sort(a,low,max);
    }

    /**
     * 这里对数组进行排序
     * @param a
     * @param low
     * @param max
     */
    public static void sort(Comparable[] a,int low,int max){
        //如果数组的low和max相等,明数组不可拆分,递归结束,表示节点左右只有一个元素或者没有元素
        if(low >= max){
            return;
        }
        //通过splitPoint方法得到此时a数组最左边元素应该在的合理位置,比点小的在左边,比点大的在右边
        int point = splitPoint(a, low, max);
        //再次调用将上面元素的左边的数组重复操作(这里注意point-1,low可能就是point(左边没元素),point-1<low
        // point左边就一个元素,point-1=low都要跳出方法
        sort(a,low,point-1);
        //把上面元素的右边的数组进行重复操作(这里注意point+1,如果切分点右边没有元素point+1)
        //point右边没有元素的时候point就是max,point+1>max,point右边有1个元素的时候,point+1=max
        //此时需要跳出方法,无法在拆分
        sort(a,point+1,max);
    }

    /**
     * 在这里,会返回数组拆分的拆分点
     * @param a
     * @param low
     * @param max
     * @return
     */
    public static int splitPoint(Comparable[] a,int low,int max){
        //这里是被选中的元素(最初)位置
        int key = low;
        //这里是最左边的指针,从数组头开始遍历
        int left = low;
        //这里是最右边的指针,位置在数组尾部的下一个
        int right = max+1;
        //当right>left时,开始遍历,就是表示right指针在left右边的时候,开始遍历,这里不能等于(等于的时候已经找到了key的合适位置),right再次移动就错过了key的交换点
        while (right > left){
            //从最右边开始遍历数组,找到第一个比key小的元素,但是不能越界
            while (greater(a[--right], a[key])) {
                if (right <= low) {
                    break;
                }
            }
            //从最左边开始遍历数组,找到第一个比key大的元素,但是不能越界
            while (greater(a[key], a[++left ])) {
                if (left >= max) {
                    break;
                }
            }
            //如果此时right索引在left索引的右边,把值进行交换
            if (right > left){
            exchange(a, left, right);}
        }
        //如果不在右边,则表示left,right重叠或者,right在left左边,并且找到了比key小的元素,此索引就是key的合适的位置
            exchange(a,key,right);
        return right;
    }

    /**
     * 比较t,v的大小
     * @param t
     * @param v
     * @return
     */
    public static boolean greater(Comparable t, Comparable v){
        return  t.compareTo(v) > 0;
    }

    /**
     * 这里对数组a的pre和latter索引处的值进行交换
     * @param a
     * @param pre
     * @param latter
     */
    public static void exchange(Comparable[] a,int pre ,int latter ){
        Comparable temp;
        temp = a[pre];
        a[pre] = a[latter];
        a[latter] = temp;
    }
}
