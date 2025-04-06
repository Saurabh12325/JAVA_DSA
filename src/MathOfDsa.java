public class MathOfDsa {
    public static void main(String[] args) {
        AnyBaseToDec(221,473);
        AnyBaseTObinary(25,3);
        fastExponential(2,3);
    }

    public static  void AnyBaseToDec(int binaryNum ,int base){
        int resNum  = 0;
        int power = 0;
        while (binaryNum>0){
            int unitdigit = binaryNum%10;
            binaryNum/=10;
            resNum += unitdigit*Math.pow(base,power);
            power++;

        }
        System.out.println(resNum);
    }
    public static void AnyBaseTObinary(int decimalNum,int base){
        int resNum = 0;
        int power = 0;
      while (decimalNum>0){
          int rem  = decimalNum%base;
          decimalNum/=base;
          resNum += rem*Math.pow(10,power);
          power++;

      }
      System.out.println(resNum);
    }

    public static void fastExponential(int num,int power) {
        double res = 1;
        while (power > 0) {
            if (power%2 != 0) { //not even
                res = res * num;
            }
            power /= 2;
            num = num * num;

        }
        System.out.println(res);
    }

}
