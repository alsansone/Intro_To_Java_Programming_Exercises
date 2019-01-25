public class Exercise_6_08 {
    public static void main(String[] args) {
        double celsius = 40, fahrenheit = 120;
        System.out.printf("%-15s%-15s|%15s%15s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < 10; celsius--, fahrenheit -= 10, i++) {
            System.out.printf("%-15.1f%-15.1f|%10.1f%18.2f\n", celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
        }
    }
    // Method to convert celsius to fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
