// import java.util.Scanner;
// class hello{
//     int a = 10;
//     // void hi(){
//     //     System.out.println("the number is:" + a);
//     // }
// }
// class hello2 extends hello{
//     int b = 20;
//     // void hi2()
//     // {
//     //     System.err.println(" the second number is :" +(a+b));
//     // }
// }
// public class Lab3 extends hello2{
//     int c = 30;
//     void hi()
//     {
//      System.err.println(a+b+c);
//     }
//     public static void main(String [] args){
    
//     // hello sc = new hello();
//     // sc.hi();
    
//     // hello2 sc2 = new hello2();
//     // sc2.hi2();
//     Lab3 sc3 = new Lab3();
//     sc3.hi();
//     // System.err.println("the child class os: "+ (sc3.a+sc3.b+c));
//     }
// public class Lab3{
//     int num = 100;
//     public void cal(int num){
//      this.num = num *10;
//     }
//     public void print(){
//         System.out.println(num);
//     }
//     public static void main(String[] args) {
//         Lab3 obj = new Lab3();
//         obj.cal(2);
//         obj.print();

//     }
// }
class Hello{
    public int rollno;
    public static String name;
    public double marks;
    Hello(int rollno,double marks ){
        this.rollno = rollno;
        this.marks = marks;
        // this.name = name;
    }
    public void print(){
        System.out.println("the name is "+name);
        System.out.println("the rollno is "+rollno);
        System.out.println("the marks is "+marks);
    }
}
public class Lab3 {

    public static void main(String[] args) {
        Hello obj = new Hello(100,35);
        obj.name = " sohan";
        
        Hello obj1 = new Hello(101,20);
        obj1.name = " Anoop";
        obj.print();
        obj1.print();
    }
}