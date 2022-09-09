import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[8000000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(80000);
        }
        QuickSort qs = new QuickSort();
        long time1 = System.currentTimeMillis();
        qs.quickSort(arr,0,arr.length-1);
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);

    }

    public void quickSort(int[] arr,int left,int right)
    {
        int l = left;
        int r = right;
        int midVal = arr[(left + right)/2];
        while(l<r)
        {
            while(arr[l]<midVal)
            {
                l++;
            }
            while(arr[r]>midVal)
            {
                r--;
            }
            if(l>=r)
            {
                break;
            }
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;

            if(arr[l] == midVal)
            {
                r--;
            }
            if(arr[r]==midVal)
            {
                l++;
            }
        }

        if(l==r)
        {
            l++;
            r--;
        }

        if(left<r)
        {
            quickSort(arr,left,r);
        }
        if(right>l)
        {
            quickSort(arr,l,right);
        }
    }
}
