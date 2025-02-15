package BASIC_HASHING.Day2_Hashing;
import java.util.*;
public class Longest_Sequence_Approch2 {
    public static void main(String[] args) {
        int[] nums= {100,22,0,1,5,3,4,2,6};
        Longest_Sequence_Approch2 sol = new Longest_Sequence_Approch2();
        int ans = sol.Longest(nums);
        System.out.println(ans);

    }
    public int Longest(int[] nums){
        int length = nums.length;
        int longest_seq = 1;
        Set<Integer>set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            set.add(nums[i]);

        }
        for(int it : set){
            if(!set.contains(it-1)){
                int x = it;
                int count =1;
                while (set.contains(x+1)){
                    x = x+1;
                    count++;
                }
                longest_seq = Math.max(longest_seq,count);
            }
        }
        return longest_seq;
    }
}
