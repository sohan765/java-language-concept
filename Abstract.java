abstract class Base3 {
    int x = 30;
    abstract public void hello3();
    abstract public void hi5();
    public void vi(){
        System.out.println("hello good morning all ");
    }
}
class Parent3 extends Base3{
    int y = 20;
    public void hello3(){
        System.out.println("implementation of the hello3 function :");
    }
    public void hi5(){
        System.out.println("implementation of the hi5 function :");
    }
}
class Moh2 extends Base3{
     public void call(){
        System.out.println("vhchg");
     };
    public void hello3(){
        System.out.println(" implement into the Moh :");
    }
    public void hi5(){
        System.out.println(" implement into the Moh :");
    }

}
public class Abstract{
    public static void main(String[] args) {
        Parent3 sc = new Parent3();
        System.out.println("hello");
        // sc.hello3();
        // sc.hi5();
        Base3 b1 ;

        b1 = new Moh2();
        b1.hello3();
        sc.y = 69;
    }
}

