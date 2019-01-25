public class Exercise_5_20 {
    public static void main(String[] args) {
        int count = 1; // Count the number of prime numbers
        int number = 2; // A number to e tested for primeness

        System.out.println("The first 1000 prime numbers are \n");

        // Repeatedly find prime numbers
        while (number <= 1000) {
            // Assume number is prime
            boolean isPrime = true; // Is the current number prime?

            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, the number is not prime
                    isPrime = false;
                    break;
                }
            }

            // Display the prime number and increase count
            if (isPrime) {
                count++;

                if (count % 8 == 0) {
                    // Display the number and advance to new line
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
            // Check if the next number is prime
            number++;
        }
    }
}
