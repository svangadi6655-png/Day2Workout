public class Powercalculator {
    public static int power(int base,int exponent){
        int result=1;
        for(int i=1;i<=exponent;i++){
            result=result*base;
        }
        return result;
    }
    public static void main(String[] args) {
        int output=power(2,5);
        System.out.println("power: "+output);
    }
}
