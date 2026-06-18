public class Static{
    static void change(int arr[]){
        arr[0] = 26;
    } 
    static void change(){
//if we are change the return type of teh function and doing function overloading its gernerate error
        System.out.println("hello good morning bro!");
    }
    static void change(int a){// a is a parameter
        System.out.println("hello good morning  "+a+" bro!");
    }

    /*  these all happing due to the reference of array is passing to the function
    as argument then change into the function directly reflect on the main method
    if the reference is not passing to the function then the not change in main method 
    */
    public static void main(String[] args) {
        int arr[] = {12,2,1,13,123};
        System.out.println("before the change " +arr[0]);
        change(arr);
        change();
        change(200); // 200 is argument and Arguments are actual
        //System.out.println("After th echange in array using static function : "+arr[0]);

    }}