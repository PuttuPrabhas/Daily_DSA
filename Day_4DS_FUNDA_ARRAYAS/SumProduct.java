package Day_4DS_FUNDA_ARRAYAS;

public class SumProduct {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int sum=0;
        int product=1;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            product*=arr[i];;

        }
        System.out.println("the sum is: "+sum);
        System.out.println("the product is "+product);
    }
}
