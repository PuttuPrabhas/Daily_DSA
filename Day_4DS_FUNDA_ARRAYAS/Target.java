package Day_4DS_FUNDA_ARRAYAS;

import java.util.Arrays;
import java.util.Scanner;

public class Target {

    static int[] Target_value(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] + arr[j] == target) {
                    return new int[] {i,j};
                }

            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter target value");
        int target = sc.nextInt();
         int[] ans = Target_value(arr, target);
        System.out.println(Arrays.toString(ans));

        }

}