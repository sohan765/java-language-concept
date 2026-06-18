// Constructor Thread(String);
// class Mythread extends Thread{
//     public Mythread(String name){
//       super(name);
//     }
//     public void run(){
//         int i = 34;
//         System.out.println("hello everyone and good morning");
//     }
// }
// public class Getprioritymethod{
//     public static void main(String[] args) {
//         Mythread obj = new Mythread("sohan");
//         obj.start();
//         System.out.println("the ID of the thread is :"+obj.getId());
//         System.out.println("the name of the thread is :"+obj.getName());
//     }
// }


// constructor thread(runnable,string);
class Mythread{
    Thread t1;
    Mythread(Runnable r,String name){
         t1 = new Thread(r,name);
        System.out.println("the id of the thread is :"+t1.getId());
        System.out.println("the name of the thread is :"+t1.getName());
    }
    public void startThread(){
    t1.start();
    }
}
class MyHello implements Runnable{
    public void run(){
        System.out.println("welcome to runnable class:");
    }
}
public class Getprioritymethod{
    public static void main(String[] args) {
     MyHello m1 = new MyHello();
     Mythread m2 = new Mythread(m1, "sohan");
    }
 }
