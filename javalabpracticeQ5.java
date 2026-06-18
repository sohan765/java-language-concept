import java.util.Scanner;
public class javalabpracticeQ5{
     public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("enter the value of a ");
    a = sc.nextInt();
  if(a>1 && a<100){
     if(a%2==0){
          System.out.println("the number is even ");
     }
     else{
          
          System.out.println("the number is odd ");
     }
  } else{
     System.out.println("Please Enter the number between the 1 to 100 ");
  }
     }
}