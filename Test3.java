import java.util.*;
public class Test3 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[3];
            arr[5] = 10;   // ArrayIndexOutOfBoundsException
        }// catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Array index is invalid");
        
        // }
        catch (Exception e){
   System.out.println(" te gvvbj");
        } 
        finally{
            System.out.println("hyy how are you :");
        }
    }
}