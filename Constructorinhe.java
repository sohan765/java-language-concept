class Hello1{
       Hello1(){
       System.out.println("base class constructor :");
    }
    Hello1(int a){
        System.out.println("Base class constructor in value of a :"+a);
    }
}
class Derived1 extends Hello1{
    Derived1(){
        System.out.println("derived class constructor :");
    }
    Derived1(int a,int b){
        super(a);
        System.out.println("derived class constructor in value of b :"+b);
    }
}
class Child extends Derived1{
    Child(){
        System.out.println("child class constructor :");
    }
    Child(int a,int b, int c){
        super(a,b);
        System.out.println("child class constructor in value of c :"+c);
    }
}
public class Constructorinhe {
    public static void main(String[] args) {
        //Hello1 h1 = new Hello1();
        // Derived1 d1 = new Derived1(1,2);
        Child c1 = new Child(11,12,13);

    }
}
