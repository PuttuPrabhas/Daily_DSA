package Day_4DS_FUNDA_ARRAYAS;

import java.util.Scanner;

public class Accurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,1,2,1};

        int count =0;
        System.out.println("enter the occurance number:");
        int n = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n) {
                count+=1;

            }

        }
        System.out.println("the count of "+ n + "   is  "+count);
    }
}
