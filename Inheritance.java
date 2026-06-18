class Base{
    // int x;
    // int y;
    Base(){
        System.out.println("base class constructor :");
    }
    Base(int a){
        // this.x = a;
        // this.y = b;
        // System.out.println(" base class x is :"+x);
        // System.out.println("base class y is :"+y);
        System.out.println("the value in base class is :"+a);
    
    }
    // void hello(){
    //     System.out.println(" base class x is :"+x);
    //     System.out.println("base class y is :"+y);
    // }
}
class Mango extends Base{
    
    Mango(int a,int b ){
        super(a);
        // this.z = z;
        System.out.println("value of z in derived class is: "+b);
    }
    // void hi2(){
    //     System.out.println("value of z in derived class is: "+z);
    // }
}
public class Inheritance{
    public static void main(String[] args) {
     Mango m1 = new Mango(11, 12);  
    //  m1.hello();
    //  m1.hi2();

    }
}