class A{
    // A(){
    //     System.out.println("base class constructor");
    // }
    public void hello(){
        System.out.println("value in base class construuctor ");
    }
}
class B extends A{
    @Override
    public void hello(){
        System.out.println("derived");
    }
}
public class Methodoverriding {
    public static void main(String[] args) {
        A b2 = new A();
        b2.hello();
        B b1 = new B();
        b1.hello();
    }
}
