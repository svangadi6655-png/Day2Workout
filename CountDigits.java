public class CountDigits {
    public static void main(String[] args) {
        
        int number = 12345;   // Given number
        int count = 0;

        // Handle 0 separately
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number = number / 10;  // Remove last digit
                count++;               // Increase count
            }
        }

        System.out.println("Number of digits: " + count);
    }
}