package Day_4DS_FUNDA_ARRAYAS;

import java.util.Arrays;
import java.util.Scanner;

public class Rev_Array {
    static void rev(int[] arr,int n) {
        for (int i = n-1; i>=0; i-- ) {
            System.out.print(arr[i]+"\t");


        }
    }





        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the no of elements in arrray: ");
            int n = sc.nextInt();
            int [] arr =  new int[n];
            System.out.println("enter array elements :");
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();

            }
            System.out.println("the initial array is :"+ Arrays.toString(arr));
             rev(arr,n);

    }
}
