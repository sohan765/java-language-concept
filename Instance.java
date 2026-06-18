import java.util.*;
class Box{
    float x = 20.2f;
    float y = 30.2f;
    float z = 10.2f;
    float area(){
        return 2*(x*y + y*z + z*x);
    }
}
class Circle{
    float x = 20.2f;
    float y = 30.2f;
    float r = 10.2f;
    float area(){
        return (22/7)*r*r;
    }
}
public class Instance {

    public static void main(String[] args) {
        Box b1 = new Box();
        Circle c1 = new Circle();
        float x = 20.02f;
        float y = 30.20f;
        System.out.println("The value of x is : "+ x);
        System.out.println("The value of x in class box is  : "+ b1.x);
        System.out.println("The value of x in class circle is  : "+ c1.x);
        System.out.println("the sum is : "+ (x+b1.x)+" " +(y + c1.y));
    }
}