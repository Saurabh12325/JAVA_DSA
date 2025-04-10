package MATH_DSA;

public class ArmstrongNumber {

    public static void main(String[] args) {

        armstrong(153);
    }

    public static void armstrong(int num) {
        int cubicsum = 0;
        int temNum = num;
        while (num > 0) {
            int lastdigit = num % 10;
            cubicsum += (int) Math.pow(lastdigit, 3);
            num = num / 10;

        }
        if(temNum == cubicsum){
            System.out.println("this no is armstrong number");
        }
        else {
            System.out.println("this no is not armstrong number");
        }
    }
    }


