import java.util.Scanner;
class Superclass{
    final int a = 20;
}
class Subclass extends Superclass{
    void fun(){
       // a = 40;// final can not be reassign;
        System.out.println(a);
    }
}
public class Week3{
public static void main(String[] args){
    Subclass sc = new Subclass();
    sc.fun();
}
}