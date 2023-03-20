/*
 * Fecha de creacion: 18/03/2023 20:38:38
 * Version: v.0.1
 * Proyecto: En esta clase haremos el proceso de conversion.
 */
package clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 * @author Willy Stbn
 */
public class API_Conversor {

    private static final String API_KEY = "d5c7b98b48ec4c94bb4bb0ef87934bf2";
    private static final String BASE_URL = "https://openexchangerates.org/api/latest.json?app_id=" + API_KEY;

    public double cantidadAConvertir(double MX, String codigoMoneda) {
        double tasaDeCambio = obtenerTasaDeCambio(codigoMoneda);
        return MX * tasaDeCambio;
    }

    private double obtenerTasaDeCambio(String codigoMoneda) {
        try {
            URL url = new URL(BASE_URL);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            JSONObject jsonContent = new JSONObject(content.toString());
            JSONObject rates = jsonContent.getJSONObject("rates");
            double usdToMxnRate = rates.getDouble("MXN");
            double usdToTargetRate = rates.getDouble(codigoMoneda);

            return usdToTargetRate / usdToMxnRate;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error al obtener tasa de cambio\n" + e);
        }
        return 0;
    }
}
