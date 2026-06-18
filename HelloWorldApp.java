// first applet program
// what is applet : a java applet is a program taht appears embedded in a web document and applet come
//                  into effect when the browser browse y=the web page
// import java.applet.Applet;
// import java.awt.Graphics;
// Building an applet :--> Edit -> Save -> Compile
// public class Helloworldapplet extends Applet{
//     public void paint(Graphics g){
//         g.drawString("Hello ! World",150,150);

//     }
//     public static void main(String[] args){
//         System.out.println("my name is sohan");
//     }
// }
import javax.swing.*;
import java.awt.*;

public class HelloWorldApp extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hello ! World", 800, 980);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My name is sohan patel");
        HelloWorldApp panel = new HelloWorldApp();
        
        frame.add(panel);
        frame.setSize(780, 890);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
