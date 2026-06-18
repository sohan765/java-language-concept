import java.util.Scanner;
import java.util.Random;
class Game{
    public int number;
    public int noguess = 0;
    public int inputnumber;
    Game(){
        Random r = new Random();
     this.number = r.nextInt(100);
    }
    // public int getnumber(){
    //     return noguess;
    // }
    // public void setnumber(int noguess){
    //     this.noguess = noguess;
    // }
    int takeuserinput(){
        System.out.println("Guess the correct number :");
    Scanner sc = new Scanner(System.in);
    inputnumber = sc.nextInt();
    return inputnumber;
    }
    boolean iscorrect(int num){
        noguess++;
        if(num == number){
            System.out.format("you guess the correct number and it was %d\nyou guessed it in %d attemps",number,noguess);
            return true;
        }
        else if(num>number){
            System.out.println("Too high...");
        }
        else if(num<number){
            System.out.println("Too low...");
        }
        return false;
        
    }
}
public class Guessing_number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean c = false;
        while(!c){
        int b =g.takeuserinput();
        c = g.iscorrect(b);
    }   
    }
}
