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

    private static final String API_KEY = "TU_API_KEY";
    private static final String BASE_URL = "https://openexchangerates.org/api/latest.json?app_id=" + API_KEY;

    public double cantidadAConvertir(double cantidadEnPesosMexicanos) {
        double tasaDeCambio = obtenerTasaDeCambio();
        return cantidadEnPesosMexicanos * tasaDeCambio;
    }

    private double obtenerTasaDeCambio() {
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

            return 1 / usdToMxnRate;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
