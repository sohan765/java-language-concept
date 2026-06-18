import java.util.Scanner;
public class Assesment2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt();
        double c = (double)a;
        System.out.println("the number after the typecasting is : "+c);
        
        if(a>0 && a%2==0 && a%3==0 && a%5==0){
            System.out.println("Perfect Number Condition Matched : "+a);
        }
        else{
            if(a>0){
            System.out.println("The number is Positive(+) : "+a);
        } else if(a<0){
            System.out.println("The number is Negative(-) : "+a);
        } else{
            System.out.println("the nuber is Zero : "+a);
        }
        if(a%2==0){
            System.out.println("the number is Even : "+a);
        }
        else{
             System.out.println("the number is Odd : "+a);
        }
        if(a%3==0 && a%5 ==0){
            System.out.println("the number is divisible by both 3 and 5 : "+a);
        }
        else{
            System.out.println("the number is not divisible by 3 and 5 : "+a);
        }
        }
        sc.close();
    }
}