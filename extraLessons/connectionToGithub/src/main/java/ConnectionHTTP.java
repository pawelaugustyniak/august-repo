import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

class ConnectionHTTP {

    GithubUrlCreator githubUrlCreator = new GithubUrlCreator();
    HttpURLConnection httpURLConnection;

    public HttpURLConnection open(String username, String reponame) {
        try {
            httpURLConnection = (HttpURLConnection) githubUrlCreator.create(username, reponame).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Accept", "application/vnd.github.v3.text-match+json");
            if(httpURLConnection.getResponseCode() != 200) {
                throw new RuntimeException("Failed: HTTP error code: "+ httpURLConnection.getResponseCode());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return httpURLConnection;
    }

    public InputStream connectionInputStream() {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void disconnectHttpConnection() {
        httpURLConnection.disconnect();
    }
}
