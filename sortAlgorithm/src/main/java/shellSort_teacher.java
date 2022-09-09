import java.util.Arrays;
import java.util.Random;

public class shellSort_teacher {
    public static void main(String[] args) {
        int[] arr = new int[800000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(80000);
        }
        long time1 = System.currentTimeMillis();

        for (int gap = arr.length /2; gap >0 ; gap/=2) {
            for (int i = gap; i < arr.length ; i++) {
               int j = i;
               int tmp = arr[j];
               if(arr[j]<arr[j - gap])
               {
                   while(j-gap >=0 && tmp<arr[j - gap])//先位移让出位置
                   {
                       arr[j] = arr[j - gap];
                       j-=gap;
                   }
                   arr[j] = tmp;
               }
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
//        System.out.println(Arrays.toString(arr));
    }
}
