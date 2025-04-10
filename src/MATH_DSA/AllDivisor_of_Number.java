package MATH_DSA;

public class AllDivisor_of_Number {
    public static void main(String[] args) {
    divisor(24);
    }
    public  static  void  divisor(int num){
        int counter = 1;
        int sqrt = (int)Math.sqrt(num);
        while (counter <= sqrt){
            if(num%counter ==0){
                System.out.println(counter +"is divisor of " + num);
                int otherNum = num/counter;
                if (otherNum!=counter) {
                    System.out.println(otherNum + "is divisor of " + num);
                }
            }
            counter++;
        }
    }
}
