import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {13,22,31,45,56,67,111,222,333};


        int count = 0;
        int asInt = Arrays.stream(arr).max().getAsInt();
        while(asInt!=0)
        {
            count++;
            asInt/=10;
        }
        Sort(arr,count);
        System.out.println(Arrays.toString(arr));


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
