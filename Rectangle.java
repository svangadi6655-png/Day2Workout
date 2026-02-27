public class Rectangle {
    double length;
    double width;
    static void area(double length,double width){
        System.out.println("area of rectangle is: "+length*width);
    }
    public static void main(String[] args){
      area(2.0,5.0);
    }
}
