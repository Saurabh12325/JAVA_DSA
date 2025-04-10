package MATH_DSA;

public class PrimeNumber {
    public static void main(String[] args) {
        prime(5);
    }
    public static void prime(int num){
        int counter = 2;
        int sqrt = (int) Math.sqrt(num);
        while(counter<=sqrt){
            if(num%counter == 0){
                System.out.println(num + " is not prime number");
                return;
            }
            counter++;

        }
        System.out.println(num +" is prime number");
    }
}
