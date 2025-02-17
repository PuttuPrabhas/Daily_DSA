package Day_4DS_FUNDA_ARRAYAS;

import java.util.Scanner;

public class Alt_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int [] arr=  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        int mid = n/2;
        int j= n-1;

        for (int i = 0; i <=mid; i++) {
            System.out.print(arr[i]+"\t");
            if(i!=j & j>i) {
                System.out.print(arr[j]+"\t");
                j--;

            }


            //System.out.print(arr[i]+"\t");
            //for (int j = n-1; j > mid; j--) {
                //System.out.print(arr[j]+"\t");
               // break;

        }
    }
}
