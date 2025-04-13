package Bit_Manipulation;

public class ClearMSB_LSb {
    public static void main(String[] args) {
        printBit(53);
        int res1 = clearLSB(53,4);
       printBit(res1);
        int res2 = clearMSB(53,4);
        printBit(res2);
        int res3 = clearMSBExclusive(53,4);
      printBit(res3);
    }
    public static void printBit(int num){
        for(int i = 7;i>=0;i--){
            System.out.print((num>>i)&1);
        }
        System.out.println();
    }
    //Clear LSB
    public static int clearLSB(int num,int bit){
        return num & ~((1<<bit+1)-1);
    }
    //Clear MSB
    public static int clearMSB(int num,int bit){
        return num & ((1<<bit)-1);
    }
    //Clear MSBm exclusive
    public static int clearMSBExclusive(int num,int bit){
        return num & ((1<<bit+1)-1);
    }

}
