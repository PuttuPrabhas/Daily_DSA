package Sorting;
import java.util.*;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,7,4,3,7,8};
        Quick_sort sol =  new Quick_sort();
        int[] ans = sol.quick(arr);
        System.out.println(Arrays.toString(ans));
    }
    public int[] quick(int[] arr){
        int n = arr.length;
        qs(arr, 0 , n-1);
        return arr;
    }
    public void qs(int[] arr,  int low, int high){
        if(low<high){
            int pindex = partition(arr, low, high);
            qs(arr, low ,pindex-1);
            qs(arr, pindex+1,high);
        }
    }
    public int partition(int [] arr , int low , int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>= low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[low];
        arr[low] =arr[j];
        arr[j]=temp;
        return j;
    }
}
