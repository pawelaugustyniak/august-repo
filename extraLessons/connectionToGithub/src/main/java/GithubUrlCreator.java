import java.net.MalformedURLException;
import java.net.URL;

class GithubUrlCreator {

    private static final String HTTPS_API_GITHUB_COM = "https://api.github.com";

    URL create(String username, String reponame) {
        try {
            return new URL(getURLString(username, reponame));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private String getURLString(String username, String reponame) {
        return HTTPS_API_GITHUB_COM + "/repos/" + username + "/" + reponame;
    }
}
