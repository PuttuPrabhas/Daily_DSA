package BASIC_HASHING.Day2_Hashing;

import java.util.HashMap;
import java.util.Map;

public class Count_subArrays_sum_k {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int  k  = 6;
        Count_subArrays_sum_k sol = new Count_subArrays_sum_k();
        int ans =  sol.SubArray(arr,k);
        System.out.println(ans);
    }
    public int SubArray(int[] arr, int k){
        int count = 0;
        int sum =0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
            int rem = sum - k;
            count += map.getOrDefault(rem,0);
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        System.out.println(map);
        return count;
    }
}
