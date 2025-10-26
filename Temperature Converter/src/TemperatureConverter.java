import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = input.nextDouble();

        System.out.print("Convert to Celcius or Fahrenheit? (C or F): ");
        unit = input.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp -32) * 5 / 9 : (temp * 9 / 5) + 32;

        System.out.printf("%.1f°%s", newTemp, unit);

        input.close();
    }
}