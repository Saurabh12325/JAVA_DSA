package Bit_Manipulation;

public class check_Power_of_2 {
    public static void main(String[] args) {
       isPoweroftwo(16);
    }
    public static void isPoweroftwo(int num){
        if((num & num-1) == 0){
            System.out.println("number is power of two");
        }
        else {
            System.out.println("number is not power of two");
        }
    }
}
