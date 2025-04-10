package MATH_DSA;

public class GreatestCommnDivisor {
    public static void main(String[] args) {
   gcd(24,36);
   euclidian(24,36);
   euclidianefficient(24,36);
    }
    //MAthematics approach
    public static void gcd(int num1,int num2){
        int min = (num1 <= num2) ? num1 : num2;
        while(min>0){
            if(num1%min == 0 && num2%min ==0){
                System.out.println("GCD is "+ min);
                break;
            }
            min--;
        }

    }

    //Euclidian  Algorithm
    public static void euclidian(int num1,int num2){
        while ((num1!=0 && num2!=0)){
            if(num1>num2){
                num1 -= num2;
            }else {
                num2 -= num1;
            }
        }
        int res = num1;
        if(num1 == 0) {
            res = num2;
        }

        System.out.println("GCD is " + res);

    }

    //efficient gcd
    public static void euclidianefficient(int num1,int num2){
        while ((num1!=0 && num2!=0)){
            if(num1>num2){
                num1 %= num2;
            }else {
                num2 %= num1;
            }
        }
        int res = num1;
        if(num1 == 0) {
            res = num2;
        }

        System.out.println("GCD is " + res);

    }
}
