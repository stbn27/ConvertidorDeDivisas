/*
 * Fecha de creacion: 19/03/2023 17:47:50
 * Version: v.0.1
 * Proyecto: 
 */

package clases;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class ConversorUniversal {
    private static final String API_KEY = "d5c7b98b48ec4c94bb4bb0ef87934bf2";
    private static final String BASE_URL = "https://openexchangerates.org/api/latest.json?app_id=" + API_KEY;

    public double convert(double cantidad, String codigoMonedaOrigen, String codigoMonedaDestino) {
        double tasaDeCambio = obtenerTasaDeCambio(codigoMonedaOrigen, codigoMonedaDestino);
        return cantidad * tasaDeCambio;
    }

    private double obtenerTasaDeCambio(String codigoMonedaOrigen, String codigoMonedaDestino) {
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
            double usdToOriginRate = rates.getDouble(codigoMonedaOrigen);
            double usdToTargetRate = rates.getDouble(codigoMonedaDestino);

            return usdToTargetRate / usdToOriginRate;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}



//////////////////////////////////
//AnyCurrency anyCurrency = new ConversorUniversal();
//double conversionADolaresEstadounidenses = anyCurrency.convert(100, "EUR", "USD");