class Phone{
    public void showingtime()
    {
        System.out.println("timing is : 10 pm");
    }
    public void on(){
        System.out.println("On phone ...");
    }
}
class SmartPhone extends Phone{
    public void Music (){
        System.out.println("play music in Smartphone :");
    }
    public void on(){
        System.out.println("On Smartphone ...");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone p1 = new SmartPhone();
        p1.on();
        p1.showingtime();
       // p1.Music();  showing error due to the base class do not consist of Music function 
    }
}
