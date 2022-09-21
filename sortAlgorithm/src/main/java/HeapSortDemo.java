import java.util.Arrays;

public class HeapSortDemo {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr)
    {
        //先调整成大顶堆
        for(int i = (arr.length/2) - 1;i>=0;i--)//i为顶点元素
        {
            heapAdjust(arr,i,arr.length);
        }
        //再来排序的过程
        for (int j = arr.length -1; j >=0 ; j--) {
            int tmp = arr[j];
            arr[j] = arr[0];
            arr[0] = tmp;
            heapAdjust(arr,0,j);
        }
    }


    /**
     *
     * @param arr
     * @param i 顶点的索引  arr.length/2 - 1   k=2*i+1   i结点的左结点  k+1 i的右结点
     * @param length  需要调整的长度  整个需要就是整个长度   一段为一段的长度
     */
    public static void heapAdjust(int[] arr,int i,int length)
    {

        int tmp = arr[i];//先保存顶点的值  需要交换用的
        for (int k = 2*i+1; k < length; k=k*2 + 1) {
            if(k+1< length && arr[k]<arr[k+1])
            {
                k++;
            }
            if(tmp<arr[k])
            {
                arr[i] = arr[k];
                i=k;
            }
            else
            {
                break;
            }
        }
        arr[i] = tmp;
    }
}



