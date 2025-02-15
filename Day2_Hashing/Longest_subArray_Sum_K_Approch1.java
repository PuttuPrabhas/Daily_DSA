package BASIC_HASHING.Day2_Hashing;

public class Longest_subArray_Sum_K_Approch1 {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        Longest_subArray_Sum_K_Approch1 sol = new Longest_subArray_Sum_K_Approch1();
        int ans  = sol.subArray(nums,k);
        System.out.println(ans);
    }
    public int subArray(int[] nums , int k){
        int longest =0;
        for (int i = 0; i < nums.length; i++) {
            int sum =0;
            for (int j = i; j < nums.length; j++) {
                sum+=nums[j];
                if(sum==k){
                    longest = Math.max(longest,j-i+1);
                }

            }

        }
        return longest;
    }

}
