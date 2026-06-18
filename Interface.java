interface Vehicle {
void start();
void stop();   
}
interface Vehicle1{
    void music();
    void showview();
}
class Car implements Vehicle,Vehicle1{
public void start(){
    System.out.println("the car is start using the key :");
} 
public void stop(){
    System.out.println("the car is stop using apply break :");
} 
public void music(){
    System.out.println("the car is play music using start button :");
} 
public void showview(){
    System.out.println("the car is show back view :");
} 
}
public class Interface {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.stop();
        c1.music();
        c1.showview();
    }
}
