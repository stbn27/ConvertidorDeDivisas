/*
 * Fecha de creacion: 20/03/2023 01:11:45
 * Version: v.0.1
 * Proyecto: 
 */
package clases;

/**
 * @author Willy Stbn
 */

public class ConvertirTemperatura {

    public double celsiusAFahrenheit(double cantidad) {
        return (cantidad * 9 / 5) + 32;
    }

    public double celsiusAKelvin(double cantidad) {
        return cantidad + 273.15;
    }

    public double fahrenheitACelsius(double cantidad) {
        return (cantidad - 32) * 5 / 9;
    }

    public double fahrenheitAKelvin(double cantidad) {
        return ((cantidad - 32) * 5 / 9) + 273.15;
    }

    public double kelvinACelsius(double cantidad) {
        return cantidad - 273.15;
    }

    public double kelvinAFahrenheit(double cantidad) {
        return ((cantidad - 273.15) * 9 / 5) + 32;
    }
}
