import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class Conversor {

    public static double ExibirConversor(String deMoeda, String paraMoeda, double quantiaConvertida) {
        double result = 0.0;
        try {
            String apiKey = "7c79d32d3e10af525d1a53ba";

            String link = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + deMoeda;
            URL url = new URL(link);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Usa Gson pra converter a resposta para Map
            Gson gson = new Gson();
            Map<String, Object> map = gson.fromJson(response.toString(), new TypeToken<Map<String, Object>>() {}.getType());

            // Pega o mapa de conversion_rates
            Map<String, Double> rates = (Map<String, Double>) map.get("conversion_rates");

            // Pega a taxa da moeda de destino
            double taxa = rates.get(paraMoeda);

            // Faz o cálculo
            result = quantiaConvertida * taxa;

        } catch (Exception e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
        }

        return result;
    }
    public void CotacaoAtual(){

        try{
        String link = "https://v6.exchangerate-api.com/v6/7c79d32d3e10af525d1a53ba/latest/USD";
        URL url = new URL(link);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        // Usa Gson pra converter a resposta para Map
        Gson gson = new Gson();
        Map<String, Object> map = gson.fromJson(response.toString(), new TypeToken<Map<String, Object>>() {}.getType());

        // Pega o mapa de conversion_rates
        Map<String, Double> rates = (Map<String, Double>) map.get("conversion_rates");

        // Pega a taxa da moeda de destino

        double cotacaoAtual= rates.get("BRL");

            System.out.println("Cotação do dolar hoje R$:" + String.format("%.2f", cotacaoAtual));

        } catch (Exception e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
        }
    }
}
