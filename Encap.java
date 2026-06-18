import java.util.Scanner;
class Circle{
    double x,y;
    double r;
    double circumference(){
        return 2*3.1456*r;

    }
    double area(){
        return (22/7)*r*r;
        
    }
}
public class Encap{
    public static void main(String[] args )
    {
    Circle c = new Circle();
    c.x =0.0;
    c.y = 0.0;
    c.r = 5.0;
    System.out.println("circumference" + c.circumference());
    System.out.println("Area" + c.area());
    }
} 