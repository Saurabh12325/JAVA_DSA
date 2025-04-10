package MATH_DSA;

public class PalindromeNumber {
    public static void main(String[] args) {
        palindrome(1221);
    }
    public  static void  palindrome(int num){
        int reversenum = 0;
        int originalNum  = num;
        while (num>0) {
            int lastdigit = num % 10;
            reversenum = reversenum*10+ lastdigit;
            num/=10;
        }
        if(reversenum == originalNum){
            System.out.println("palindrome number");
        }
        else {
            System.out.println(" not palindrome num");
        }
    }
}
