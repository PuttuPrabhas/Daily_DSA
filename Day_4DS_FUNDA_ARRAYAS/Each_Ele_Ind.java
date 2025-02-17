package Day_4DS_FUNDA_ARRAYAS;

import java.util.Arrays;
import java.util.Scanner;

public class Each_Ele_Ind {


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
        for (int j = 0; j < n; j++) {
            System.out.println("the element is "+arr[j]+"\t"+"the index is :"+j);

        }


    }
}
