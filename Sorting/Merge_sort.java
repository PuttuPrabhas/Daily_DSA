package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 6, 57, 33};

        Merge_sort sol = new Merge_sort();

        int[] ans = sol.merge(arr);
        System.out.println(Arrays.toString(ans));

    }
    public int[] merge(int[] arr ){
        int n = arr.length;
        mS(arr, 0, n-1);
        return arr;
    }
    public void mS(int[] arr , int low , int high){
        if(low>=high){
            return;
        }
        int mid  = (low+high)/2;
        mS(arr, low,mid);
        mS(arr,mid+1,high);
        merging(arr,low,mid,high);
    }
    public void merging(int[] arr , int low , int mid,  int high){
        int left = low;
        int right = mid+1;
        List<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <=high; i++) {
            arr[i]=temp.get(i-low);

        }
    }
}
