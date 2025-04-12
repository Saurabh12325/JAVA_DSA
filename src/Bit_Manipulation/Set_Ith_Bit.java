package Bit_Manipulation;

public class Set_Ith_Bit {
    public static void main(String[] args) {
        printBit(33);
        int result = setIthBit(32,5);
       printBit(result);

       int res  = togglebit(32,5);
       printBit(res);
        int resut = UnsetIthBit(33,0);
        printBit(resut);
    }
    public static void printBit(int num ){
        for(int i = 7;i>=0;i--){
            System.out.print((num>>i)&1);
        }
        System.out.println();

    }
    public static int  setIthBit(int num, int bit){ //^ (OR) → Flips that bit
        return num | (1<<bit);                              // 1 | 1 = 1 → flip 1 to 1
                                             //        0 | 1 = 1 → flip 0 to 1

    }
    //Toggle ith bit
    public static int togglebit(int num , int bit){    //toggle bit   1 << i → Creates a mask with 1 only at the i-th position
        return num ^ (1<<bit);                                           //^ (XOR) → Flips that bit
                                                                         //        1 ^ 1 = 0 → flip 1 to 0
                                                                          //        0 ^ 1 = 1 → flip 0 to
    }

    //unset Ith bit
    public static int  UnsetIthBit(int num, int bit){ //^ (And with negation of (1<<bit) → Flips that bit
        return num & ~(1<<bit);                          //1->0

    }
}
