/*
 * Fecha de creacion: 18/03/2023 20:48:32
 * Version: v.0.1
 * Proyecto: 
 */

package clases;

/**
 * @author Willy Stbn
 */

public class ConversorDemo {
    public double cantidadAConvertir(double cantidadEnPesosMexicanos) {
        // Aquí puedes utilizar un API para obtener la tasa de cambio actualizada
        double tasaDeCambio = obtenerTasaDeCambio();
        return cantidadEnPesosMexicanos * tasaDeCambio;
    }

    private double obtenerTasaDeCambio() {
        // Aquí puedes utilizar un API para obtener la tasa de cambio actualizada
        // Este es solo un ejemplo y deberías reemplazarlo con el código adecuado para utilizar el API que elijas
        return 0.05; // Supongamos que 1 peso mexicano equivale a 0.05 dólares estadounidenses
    }
}