import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FetchingData2 {
    public static void main(String[] args) throws Exception{
        URL getUrl = new URL("https://api.nationalize.io/?name=nathaniel");

        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();

        int responseCode = connection.getResponseCode();

        if(responseCode==200){
            BufferedReader data = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response=new StringBuilder();
            String readLine=null;

            while((readLine=data.readLine())!=null){
                response.append(readLine);
            }

            JSONObject jsonData=new JSONObject(response.toString());
            System.out.println(jsonData);
        }else{
            System.out.println("This not a valid URL "+responseCode);
        }
    }
}
