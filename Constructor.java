class Sphere{
    int height;
    int radius;
    public void setradius(int radius){
        this.radius = radius;
    }
    public void setheight(int height){
        this.height = height;
    }
    public int getradius(){
        return radius;
    }
    public int getheight(){
        return height;
    }
    double surfacevolume(){
        return Math.PI*radius*radius*height;
    }
    double total()
    {
        return ((2*Math.PI*radius*height)+(2*(22/7)*radius*radius)); // 22/7 ke place per MATH.PI ka use kar sakte
    }
}
public class Constructor{
public static void main(String[] args) {
    Sphere sc = new Sphere();
    sc.setheight(3);
    sc.setradius(4);
    System.out.println(sc.getheight());
    System.out.println(sc.getradius());
    System.out.println("the surface area is the : "+ sc.surfacevolume());
    System.out.println("the surface area is the : "+ sc.total());
}
    
}