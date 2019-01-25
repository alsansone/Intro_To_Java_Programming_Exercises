import java.util.Scanner;

public class Exercise_3_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed: ");
        double windSpeed = input.nextDouble();

        if (temperature > -58 && temperature < 41) {
            if (windSpeed >= 2) {
                double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) +
                        0.4275 * temperature * Math.pow(windSpeed, 0.16);
                System.out.println("Wind chill temperature is " + windChill);
            } else {
                System.out.println("Invalid wind speed");
            }
        } else {
            System.out.println("Invalid temperature");
        }
    }
}
