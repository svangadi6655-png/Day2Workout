public class Primenumber{
    static void prime(int n){
        if(n<=1){
            System.out.println("given no. is not prime");
        }
        boolean isPrime=true;
        for(int i=3;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime) {
            System.out.println("given no. is  prime");
          } 
        else{
            System.out.println("given no. is not prime");
        }
        }
    
    public static void main(String[] args) {
       prime(2);
    }
    
}