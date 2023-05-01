import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;

public class FetchingData1 {
    public static void main(String[] args) throws Exception {
        URL getUrl = new URL("https://api.zippopotam.us/us/33162");
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();

        int responsecode=connection.getResponseCode();

        if(responsecode==200){
            BufferedReader data=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String readline=data.readLine();

            while(readline!=null){
                response.append(readline);
                readline=data.readLine();
            }

            JSONObject jsonData=new JSONObject(response.toString());

            System.out.println(jsonData);
        }else{
            System.out.println("This is not a valid URL: "+responsecode);
        }
    }
}
