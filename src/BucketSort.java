import java.util.*;

public class BucketSort {
    public static void bucketSort(float[] arr) {
        int n = arr.length;
        List<Float>[] buckets = new List[n];
        for (int i = 0; i < n; i++) buckets[i] = new ArrayList<>();

        for (float num : arr) {
            int idx = (int)(n * num);
            buckets[idx].add(num);
        }

        for (List<Float> bucket : buckets) Collections.sort(bucket);

        int idx = 0;
        for (List<Float> bucket : buckets) {
            for (float num : bucket) arr[idx++] = num;
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.897f, 0.565f, 0.656f, 0.123f, 0.665f, 0.343f};
        bucketSort(arr);
        System.out.println("Sorted array:");
        for (float num : arr) System.out.print(num + " ");
    }
}
