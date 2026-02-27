public class Areacalculator {
    public static int area(int side){
return side*side;
    }
    public static int area(int length,int breadth){
        return length*breadth;
    }
    public static void main(String[] args){
        int area1=area(5);
        int area2=area(2,3);
System.out.println("area of square: "+area1);
System.out.println("area of rectangle: "+area2);
    }
}
