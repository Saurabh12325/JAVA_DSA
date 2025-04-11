package Bit_Manipulation;

public class printbit {
    public static void main(String[] args) {
        printbits(32);
    }
    public static void printbits(int num){
        for (int i = 7;i>=0;i--){  //for 8 bits
            System.out.print((num >> i) & 1);
        }
    }
}
