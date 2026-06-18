// Inheritance in the Interface
interface Sample{
    void meth1();
}
interface sample1 extends Sample{
    void meth2();
}
class Hello4 implements sample1{
    public void meth2(){
        System.out.println("Hello everyone :");
    }
    public void meth1(){
        System.out.println("Good Morning everyone :");
    }
}
interface myWifi {
void mynetwork();
String [] Getnetwork();   

}
interface camera{
    void takesnap();
    void recordvideo();
    private void greet(){
        // these method do not anywhere in these because it is private 
        System.out.println("hyy girl Good Morning..");
    }
    default void recorvideo4k(){
        greet();
        System.out.println("record video in 4k...");
        // we can override these function in the classes
    }
}
class Cellphone{
    void calling(int number){
        System.out.println("we are just calling to any number "+number);
    }
    void pickcall(){
        System.out.println("call attend...");
    }
}
class Smartphone extends Cellphone implements myWifi , camera{
public void mynetwork(){
    System.out.println("my network shows its property");
} 
public String [] Getnetwork(){
    System.out.println("Getting the network..");
    String [] network = {"Vivo2 ","Oneplus","mac"};
    return network;
} 
void connectToNetwork(String Network){
    System.out.println("Connecting to :"+Network);
}
public void takesnap(){
    System.out.println("Taking Snap and gives more clarity:");
} 
public void recordvideo(){
    System.out.println("taking full video :");
} 
}
public class Default_MethodInterfaces{
    public static void main(String[] args) {
        Smartphone sc = new Smartphone();
        sc.recorvideo4k();
        String[] arr = sc.Getnetwork();
        for(String item : arr){
          System.out.println(item);
        }
        sc.recordvideo();
    }
}