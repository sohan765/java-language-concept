public class Varargs{
    static int sum(int x,int ...arr)
    {
        int result = x;
        int count =1;
        for(int n :arr)
        {
            result += n;
            count++;

        } return (result/count);

    }
    static void pattern(int n){
        if(n>0)
        {
            pattern(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        // System.out.println("welcome");
        // System.out.println("the sum of 3 and 5 is "+sum(3,5));
        
        // System.out.println("the sum of 3 ,4 and 5 is "+sum(3,4,5));
        
        //System.out.println("the sum is "+sum()); error b/c of the its takes minimum one argument
        pattern(5);
    }
}