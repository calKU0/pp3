public class TemperatureConverter {
    static float celciusToKelvin(float celcius)
    {
        return celcius + 273.15f;
    }

    static float KelvinToCelcius(float kelvin)
    {
        return kelvin - 273.15f;
    }

    static float celciusToFahrenheit(float celcius)
    {
        return celcius * (9/5) + 32;
    }

    static float fahrenheitToCelcius(float fahrenheit)
    {
        return (fahrenheit - 32) * (5/9);
    }

    static float fahrenheitToKelvin(float fahrenheit)
    {
        return (fahrenheit - 32) * (5/9) + 273.15f;
    }

    static float KelvinToFahrenheit(float kelvin)
    {
        return (kelvin- 273.15f) * 1.8f + 32;
    }
}
