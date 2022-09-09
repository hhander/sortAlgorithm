import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[80000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(80000);
        }
        long time1 = System.currentTimeMillis();
        for(int i = 1;i<arr.length;i++)
        {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = tmp;
                    flag = true;
                }
            }
            if(!flag)
            {
                break;
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);

//        Class<bubbleSort> bubbleSortClass = bubbleSort.class;


    }
}
