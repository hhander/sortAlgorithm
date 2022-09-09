import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class ChooseSort {
    public static void main(String[] args) {
//        int[] arr = {9,8,7,6,5,4,3,2,1};
        int[] arr = new int[80000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(80000);
        }
        long time1 = System.currentTimeMillis();
        
        for(int i = 0;i<arr.length - 1;i++)
        {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[min]>arr[j])
                {
                    min = j;
                }
            }
            if(min!=i)
            {
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }
        }
//        System.out.println(Arrays.toString(arr));
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }
}
