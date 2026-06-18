import java.util.Scanner;
public class Array2D{
    public static void main(String[] args){
        int arr[][];
        Scanner sc = new Scanner(System.in);
        int row,col;
        System.out.println("enter the value of row :");
        row = sc.nextInt();
        System.out.println("enter the value of column :");
        col = sc.nextInt();
        arr = new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("displaying the array in java :");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]);
               System.out.print(" ");
            }
            System.out.println("");
        }
    }
}