import java.util.Scanner;
public class Arraypractice1{
    public static void main(String[] args){
        int arr[];
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array :");
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<arr.length;i++){
         arr[i] = sc.nextInt();
        }
        System.out.println("the array is :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the value of the number whose checking present in array or not:");
        int var = sc.nextInt();
        boolean c = false;
        for(int element : arr){
            if(var == element){
                c = true;
                break;
            }
        }
        if(c){
            System.out.println("The value present in the array :");
        }
        else{
            System.out.println("the value not present in thn array");
        }
    }
}