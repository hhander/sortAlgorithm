import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
            int[] arr = {9,8,7,6,6,4,3,3,1};
            int[] tmp = new int[arr.length];
            mergeSort(0,arr.length-1,arr,tmp);
        System.out.println(Arrays.toString(arr));
    }


    public static void mergeSort(int left,int right,int[] arr,int[] tmp)
    {
        if(left<right)
        {
            int mid = (left + right)/2;
            mergeSort(left,mid,arr,tmp);
            mergeSort(mid+1,right,arr,tmp);
            merge(left,mid,right,arr,tmp);
        }
    }
    public static void merge(int left,int mid,int right,int[] arr,int[] tmp)
    {
        int i = left;
        int j = mid + 1;
        int t = 0;
        while(i<=mid && j<=right)
        {
            if(arr[i]<=arr[j])
            {
                tmp[t] = arr[i];
                t++;
                i++;
            }
            else
            {
                tmp[t] = arr[j];
                t++;
                j++;
            }
        }

        while(i<=mid)
        {
            tmp[t] = arr[i];
            i++;
            t++;
        }

        while(j<=right)
        {
            tmp[t] = arr[j];
            t++;
            j++;
        }

        t = 0;
        int leftTmp = left;
        while(leftTmp<=right)
        {
            arr[leftTmp] = tmp[t];
            t++;
            leftTmp++;
        }
    }

}
