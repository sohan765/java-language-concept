import java.util.Scanner;
public class Array1{
static int add(int a, int b){
    return a+b;
}
static int diff(int a, int b){
    return a-b;
}
static int mult(int a, int b){
    return a*b;
}
static  int div(int a, int b){
   return a/b;
}
    public static void main(String[] args){
//     int arr[] = {12,4,56,3,34};
//     for(int i=0;i<arr.length;i++)
//     {
//         System.out.println("the array is :"+ arr[i]);
//     }
//     float sum =0;
//     for(int i=0;i<arr.length;i++)
//     {
//         sum +=arr[i];
//     }
//     float avg = sum/arr.length;
//     System.out.println("the average is :"+ avg);
Scanner sc = new Scanner (System.in);
int a = sc.nextInt();
int b= sc.nextInt();
int result =add(a,b);
System.out.println("the result is : "+result);
//int result =(a,b);
 }
}