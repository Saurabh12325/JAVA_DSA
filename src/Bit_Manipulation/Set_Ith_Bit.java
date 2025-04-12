package Bit_Manipulation;

public class Set_Ith_Bit {
    public static void main(String[] args) {
        printBit(16);
        int result = setIthBit(32,5);
       printBit(result);
       int res  = togglebit(32,5);
       printBit(res);
    }
    public static void printBit(int num ){
        for(int i = 7;i>=0;i--){
            System.out.print((num>>i)&1);
        }
        System.out.println();

    }
    public static int  setIthBit(int num, int bit){
        return num | (1<<bit);
    }
    //Toggle ith bit
    public static int togglebit(int num , int bit){    //toggle bit   1 << i → Creates a mask with 1 only at the i-th position
        return num ^ (1<<bit);                                           //^ (XOR) → Flips that bit
                                                                         //        1 ^ 1 = 0 → flip 1 to 0
                                                                         //        0 ^ 1 = 1 → flip 0 to
    }
}
