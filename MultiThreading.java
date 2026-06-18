class MyShop extends Thread{
   public  String Task;
   MyShop(String Task){
    this.Task = Task;
   }
   public void run(){
    int i=0;
    while(true){
    System.out.println("Thread 1 is been proceed");
    System.out.println("I am happy");
   } 
   
}}
class MyShop1 extends Thread{
   public  String Task;
   MyShop1(String Task){
    this.Task = Task;
   }
  
   public void run(){
    int i= 0;
    while(true){
    System.out.println("Thread 2 is going to buyC");
    System.out.println("I am sad");
    }
}
}
public class MultiThreading {
    public static void main(String[] args) {
        MyShop m1 = new MyShop("bh");
       
        MyShop1 m3 = new MyShop1("Money");
       
        m1.start();
        
        m3.start();
        
    }
}
