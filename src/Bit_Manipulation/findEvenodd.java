package Bit_Manipulation;

public class findEvenodd {
    public static void main(String[] args) {
        even_odd(45);
       printOddEven(45);
    }
    //method 1
    public static void even_odd(int num){
        if((num & 1) !=0){
            System.out.println("odd no");
        }
        else {
            System.out.println(" even no");
        }
    }

    //method 2 by using any bit using bitset means a generalized form
    public  static boolean even__odd(int num , int bits){
        int res  = (num & (1<<bits));
        return (res==0)?false:true;
    }
    public static void printOddEven(int num){
        if(even__odd(num,0)){
            System.out.println("number is odd");
        }
        else{
            System.out.println("number is even");
        }
    }

}
