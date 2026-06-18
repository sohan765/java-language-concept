import java.util.Scanner;
public class javalabpracticeQ2 {
     public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("enter the value of a ");
    a = sc.nextInt();
    System.out.println("enter the value of b ");
    b = sc.nextInt();
    System.out.println("before swaping the value of a and b is :"+a + " " + b);
    a = a+b;
    b = a-b;
    a= a-b;
     System.out.println("after swaping the value of a and b is :"+a + " " + b);
     }
}
