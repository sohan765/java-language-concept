import java.util.*;

public class Exception {
    public static void main(String[] args) {
        int c;
        int d;
        System.out.println("enter the value of x and y :");
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        d = sc.nextInt();
        try {
            int p = c/d;
            System.out.println(p);
        }
        catch(ArithmeticException e){
        System.out.println("do not divide by zero");
        } finally{
            System.out.println(" program ends");
        }
        System.out.println(" ");
    }
}
