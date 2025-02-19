package Day_6_Arrays_programs;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {10,1,20,2,33};
        int key=-999;
        int key1=999;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>key) {
                key=arr[i];
            }
            else if (arr[i]<key1) {
                key1=arr[i];
            }
        }
        System.out.println("max element is:"+key);
        System.out.println("min element is:"+key1);
    }
}
