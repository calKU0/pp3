public class TemperatureConverterMain {
    public static void main(String[] args) {
        System.out.println("25 degrees in Celcius = " + TemperatureConverter.celciusToFahrenheit(25) + " degrees in Fahrenheit");
        System.out.println("25 degrees in Celcius = " + TemperatureConverter.celciusToKelvin(25) + " degrees in Kelvin");

        System.out.println("100 degrees in Fahrenheit = " + TemperatureConverter.fahrenheitToCelcius(100) + " degrees in Celcius");
        System.out.println("100 degrees in Fahrenheit = " + TemperatureConverter.fahrenheitToKelvin(100) + " degrees in Kelvin");
        
        System.out.println("0 degrees in Kelivn = " + TemperatureConverter.KelvinToCelcius(0) + " degrees in Celcius");
        System.out.println("0 degrees in Kelivn = " + TemperatureConverter.KelvinToFahrenheit(0) + " degrees in Fahrenheit");
    }
}
