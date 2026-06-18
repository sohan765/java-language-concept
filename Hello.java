import java.util.*;
/* 
java does not allow global variable.
every var is declare inside the  class. 
ststic keyword is used to make a var just like a global.
 */
public class Hello{
    public static void main(String[] args) {
        int x =10;
        if(x==10){
            int y = 20;
            System.out.println("te sum is : "+ (x+y));
        }
        //System.out.println("y is not declare as local it gives an error" + y); // error
    }
}