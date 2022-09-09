import java.util.Arrays;
import java.util.Random;

public class shellSort1 {
    public static void main(String[] args) {
        int[] arr = new int[8000000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(80000);
        }

        int h = 1;
        while(h<(arr.length/2))
        {
            h = 2*h + 1;
        }
        long time1 = System.currentTimeMillis();
        while(h>0) {
            for (int i = h; i <arr.length; i++) {
                for (int j = i; j >=h ; j-=h) {
                    if(arr[j-h]>arr[j])
                    {
                        int tmp = arr[j-h];
                        arr[j-h] = arr[j];
                        arr[j] = tmp;
                    }
                    else
                    {
                        break;
                    }
                }
            }
            h = h/2;
        }
//        System.out.println(Arrays.toString(arr));
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }
}
