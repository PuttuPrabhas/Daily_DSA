package BASIC_HASHING.Day2_Hashing;

// brute force solution using loops
public class Longest_Sequence_Approch1 {
    public static void main(String[] args) {
        int [] nums =  {100,22,0,2,1,3,5,4};
        Longest_Sequence_Approch1 sol = new Longest_Sequence_Approch1();
        int ans = sol.Longest(nums);
        System.out.println(ans);
    }
    public int Longest(int[] nums){
        int n = nums.length;
        int longest_Seq=1;
        for(int i = 0; i < n; i++){
            int x = nums[i];
            int count = 1;
            while(LinearSearch(nums,x+1)==true){
                x=x+1;
                count++;
            }
            longest_Seq=Math.max(longest_Seq,count);
        }
        return longest_Seq;
    }
    private  boolean LinearSearch(int[] nums, int x){
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==x){
                return true;
            }

        }
        return false;
    }

}
