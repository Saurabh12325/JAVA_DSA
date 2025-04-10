package MATH_DSA;

public class NewtonRaphsonSqroot {
    public static void main(String[] args) {

      System.out.println(newtonsqroot(36));
    }
    public static double newtonsqroot(int num){
        double tolerence = 0.0001;
        double root;
        double x = num;
        while(true){
            root = 0.5 * (x + (num/x));
            double ans = num - root;
            if(ans<tolerence){
                break;
            }
            x = root;
        }
       return root;
    }
}
