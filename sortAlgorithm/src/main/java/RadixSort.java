import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[8000000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(80000);
        }



        int count = 0;
        int asInt = Arrays.stream(arr).max().getAsInt();
        while(asInt!=0)
        {
            count++;
            asInt/=10;
        }
        long time1 = System.currentTimeMillis();
        Sort(arr,count);
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);


    }

    public static void Sort(int[] arr,int count)
    {
        int mod = 1;
        while(count!=0)
        {
            int[][] buckets = new int[10][arr.length];//在个各捅存放数据
            int[] eachBucketCounts = new int[10];//记录每个桶放了几个数

            for (int i = 0; i < arr.length; i++) {
                int tmp = (arr[i]/mod)%10;
                buckets[tmp][eachBucketCounts[tmp]]=arr[i];
                eachBucketCounts[tmp]++;
            }


            int index = 0;
            for (int i = 0; i < eachBucketCounts.length; i++) {
                if(eachBucketCounts[i]!=0)
                {
                    for (int j = 0; j < eachBucketCounts[i]; j++) {
                        arr[index++] = buckets[i][j];
                    }
                }
            }

            count--;
            mod*=10;
        }

    }
}
