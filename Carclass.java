class Car{
    private int speed;
    public void setspeed(int speed){
        if(speed>=0){
            this.speed=speed;
        }
        else{
            System.out.println("speed cannot be negative");
            this.speed=0;
        }
    }
    public int getspeed(){
        return speed;
    }
}
public class Carclass{
    public static void main(String[] args) {
        Car car=new Car();
        car.setspeed(90);
        System.out.println("car speed: "+car.getspeed());
         car.setspeed(-56);
        System.out.println("car speed: "+car.getspeed());
    }
}