import java.util.Scanner;
public class Arraypractice2D{
    public static void main(String[] args){
        int arr1[][];
        Scanner sc = new Scanner(System.in);
        int row,col;
        System.out.println("enter the value for first array row :");
        row = sc.nextInt();
        System.out.println("enter the value for first array column :");
        col = sc.nextInt();
        arr1 = new int[row][col];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the value for second array row :");
        row = sc.nextInt();
        System.out.println("enter the value for second array column :");
        col = sc.nextInt();
        int arr2[][] = new int[row][col];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("the sum of matrix is :");
       int result [][] = new int [row][col];
       for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
              result[i][j] = arr1[i][j] + arr2[i][j];
            }
        } 
         for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
              System.out.print(result[i][j]);
              System.out.print(" ");
            }System.out.println("");
        }
}
}