import java.util.Scanner;

public class TemperatureConverterApp {
	public static void main(String[] args) {
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit to convert to celsius as real number");
		double temperature = scan.nextDouble();
		System.out.println(temperatureConverter.convertFahrenheitToCelsius(temperature));
	}

}
