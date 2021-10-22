
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Weather
{
    public static void main(String[] args) throws IOException {
        String apiKey = "CT1LRJznpz0mASHzUGYo0ukaIWektxT8";
        String lang = "ru-ru";

        OkHttpClient okHttpClient = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/187015?apikey="+apiKey+"&language=" + lang)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        System.out.println(response.body().string());

    }
}
