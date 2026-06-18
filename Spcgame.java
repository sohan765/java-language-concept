import java.util.*;

public class Spcgame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number where 0 for the rock and 1 for the paper and 2 for the scissor ");
        int user = sc.nextInt();
        Random random = new Random();
        int computer = random.nextInt(3);
        if(user == computer){
            System.out.println("Match draw :");
        } else if(user == 0 && computer == 2 ||user == 1 && computer == 0 ||
         user == 2 && computer == 1 )
            {
             System.out.println("you win!");
        }
        else{
            System.out.println("COmputer Win!");
        } 
        System.out.println("Computer choice : "+computer);
        if(computer == 0){
            System.out.println("Computer choice : Rock");
        }
        else if(computer == 1){
            System.out.println("Computer choice : Paper");
        }
        else  if(computer == 2){
            System.out.println("Computer choice : Scissor");
        }
        else{
            System.out.println("Incorrect choice please enter valid choice ");
        }
   sc.close();
    }
}