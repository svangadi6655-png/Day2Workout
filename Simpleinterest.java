public class Simpleinterest {
    public static void main(String[] args) {

        double P = 10000;  
        double R = 5;      
        double T = 2;     

        double SI = (P * R * T) / 100;

        System.out.println("Principal: " + P);
        System.out.println("Rate: " + R);
        System.out.println("Time: " + T);
        System.out.println("Simple Interest: " + SI);
    }
}
