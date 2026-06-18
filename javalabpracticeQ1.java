import java.util.Scanner;
public class javalabpracticeQ1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float a,b;
    System.out.println("enter the value of a ");
    a = sc.nextFloat();
    System.out.println("enter the value of b ");
    b = sc.nextFloat();
    System.out.println("1. for + , 2. for - , 3. for * , 4. for /( but the value of b not egual to 0).");
    int op = sc.nextInt();
    float result = 0.00f;
    if(op == 1){
     result = a+b;
    }
    else if(op==2){
        result = a-b;
    }
    else if(op==3){
        result = a*b;
    }
    else if(op==4){
        result = a/b;
    }else{
        System.out.println("invalid operator please try again ");
    }
    System.out.println("the result is :" + result);
    }
}
