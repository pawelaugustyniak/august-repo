import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GithubClientGet {
    public static void main(String[] args) {
        ConnectionHTTP connectionHTTP = new ConnectionHTTP();
        connectionHTTP.open("pawelaugustyniak","java-exercises-solutions");
        InputStream inputStream = connectionHTTP.connectionInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        JsonConventer jsonConventer = new JsonConventer(bufferedReader);
        System.out.println("Server output... \n");
        jsonConventer.getInfo();
        connectionHTTP.disconnectHttpConnection();
    }
}
