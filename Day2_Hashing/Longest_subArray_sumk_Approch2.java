package BASIC_HASHING.Day2_Hashing;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Longest_subArray_sumk_Approch2 {
    public static void main(String[] args) {
        int [] nums = {10, 5, 2, 7, 1, 9};
        int k =15;
        Longest_subArray_sumk_Approch2 sol = new Longest_subArray_sumk_Approch2();
        int ans  = sol.subarray(nums,k);
        System.out.println(ans);

    }
    public int subarray(int [] nums, int k){
        int longest = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum==k){
                longest = Math.max(longest,i+1);
            }
            int rem = sum-k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                longest = Math.max(longest,len);


            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println(map);
        return longest;
    }
}
