package Day_5_Strings;

public class Ascii_val {
    public static void main(String[] args) {
        String str =  "HelloWorld";
        System.out.println("the ascii values is are: ");
        for (int i = 0; i < str.length(); i++) {
            int ascii_val = str.charAt(i);
            System.out.println("the value of "+ str.charAt(i)+ "  is  "+ascii_val);
            System.out.println(str.substring(0,8));

        }
    }
}
