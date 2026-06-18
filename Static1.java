import java.util.*; 
public class Static1 {
static int x =0;
double r,y,z;
public Static1(double r , double y, double z){
    this.r = r;
    this.y = y;
    this.z = z;
    x++;
}
Static1(double r){
    this(0.0,0.0,r);
    x++;
}
Static1(Static1 s)
{
    this(s.r,s.y,s.z);
    x++;
}
Static1(){
    this(1.0,2.0,30.1);
    x++;
}
double add(){
    return (x+y+z);
}
double area(){
    return (22/7)*r*r;
}
    public static void main(String[] args) {
        Static1 s1 = new Static1();
        Static1 s2 = new Static1(5);
        Static1 s3 = new Static1(s1);
        Static1 s4 = new Static1(11.0,12.0,13.0);
     System.out.println( s1.x );
        System.out.println( s2.x );
        System.out.println( s3.x );
       System.out.println( s4.x );
    }
}