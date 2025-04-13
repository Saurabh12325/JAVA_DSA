package Bit_Manipulation;

public class CharConversion {
    public static void main(String[] args) {
        char ch = charconversionToUpperCase('a');
        System.out.println(ch);
        char ch1 = charconversionToLowerCase('A');
        System.out.println(ch1);
    }
    //lower case to uppercase
    public static char charconversionToUpperCase(int num){
        return (char) (num &~(1<<5));                                //here we using the concept of the unsetithbit
    }
    //upper case to lowercase
    public static char charconversionToLowerCase(int num){
        return (char) (num |(1<<5)) ;                                       //here we using the concept of the setIthbit
    }

}
