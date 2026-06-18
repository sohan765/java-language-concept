import java.util.Scanner;
import java.lang.*;
public class String2{
    public static void main(String[] args) {
        String message;
        Scanner Sc = new Scanner(System.in);
        // message = Sc.nextLine();
        // System.out.println("the message is :"+message);
        // for(int i=0;i<3;i++);{
        //     System.out.println("hello");
        // }
        // String move = message.toLowerCase();
        // System.out.println("the lower case letter is :"+move);
        // move = message.toUpperCase();
        // System.out.println("the Upper case letter is :"+move);
        // String a = "Sohan";
        // String b = "Sohan";
        // System.out.println(a==b);
        // String st1 = new String("sohan");
        // String str2 = new String("sohan");
        // System.out.println(st1==str2);
        String name = "sohan";
        String a1 =name;
        char arr[] = name.toCharArray();
        String rev = " ";
        for(int i=0;i<arr.length;i++){
            rev = arr[i]+rev;
        }
   if(a1==rev){
    System.out.println("palindrome");
   }
   else{
    System.out.println("not palindrome");
   }
    }
}