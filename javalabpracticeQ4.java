import java.util.Scanner;
public class javalabpracticeQ4{
     public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Float a,b,c;
    System.out.println("enter the value of a ");
    a = sc.nextFloat();
    System.out.println("enter the value of b ");
    b = sc.nextFloat();
    System.out.println("enter the value of c ");
    c = sc.nextFloat();
    if(a>b && a>c){
     System.out.println("the largest number is among those is a :" +a);
    } else if(b>a && b>c){
     System.out.println("the largest number is among those is b :" +b);
    }
    else if(c>b && c>a){
     System.out.println("the largest number is among those is c :" +c);
    } else{
     System.out.println("the no one number is larger");
    }
   
     
     }
}