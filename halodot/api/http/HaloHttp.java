package halodot.api.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HaloHttp {

    public static String get(String url, String payload, String token) throws IOException {
        URL obj = new URL(url+payload);
        HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("content-type", "application/json");
        httpURLConnection.setRequestProperty("authorization", token);
        /*OutputStream os = httpURLConnection.getOutputStream();
        os.write(payload.getBytes());
        os.flush();
        os.close();*/

        int responseCode = httpURLConnection.getResponseCode();
        System.out.println("Response Code :: " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }
}
