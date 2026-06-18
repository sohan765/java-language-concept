import java.util.Scanner;
// public class Lab2{
//     public static void main(String[] args)
//     {
//         System.out.println("hello world");
//         // byte short int long float double char boolean
       
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number :");
//         int a = sc.nextInt();
//         System.out.println("the number is :");
//         System.out.println(a);
//         // 1st Scanner = Class name; 2nd sc = reference variable; 3,= right--> left value assign;
//         // 4. new--> create new object into memory; Scanner --> constructor ko call;
//         // 6. System.in --> input stream --> keyboard ke input
//     }
// }
public class If{
    public static void main(String[] args){
        int a=10;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your income :");
        float income = sc.nextFloat();
        float tax_cal ;

        if(income>3 && income<5)
        {
            tax_cal = (income*5)/100;
            System.out.println("your tax amount is : " + tax_cal);
        }else if(income>5 && income<8){
            tax_cal = (income*10)/100;
            System.out.println("your tax amount is : " + tax_cal);
        }else if(income>8){
            tax_cal = (income*20)/100;
            System.out.println("your tax amount is : " + tax_cal);
        }
        else if(income<3){
            tax_cal = 0;
            
            System.out.println("your tax amount is : " + tax_cal);
        }
        else{
            System.out.println("concern with your CA ");
        }
    }
}