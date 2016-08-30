import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;

class JsonConventer {

    JSONObject jsonObject = null;
    String line;
    String repoName;
    String descriptionOfRepo;
    String repoStars;
    String repoAuthor;

    public JsonConventer(BufferedReader bufferedReader) {
        try {
            while((line=bufferedReader.readLine()) != null) {
                this.jsonObject = new JSONObject(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    void getInfo() {
        repoName = getStringValueFromJsonObject(jsonObject,"name");
        repoAuthor = getStringValueFromJsonObject(deeperObject(jsonObject),"login");
        descriptionOfRepo = getStringValueFromJsonObject(jsonObject,"description");
        repoStars = getStringValueFromJsonObject(jsonObject,"stargazers_count");

        System.out.println("Repo: "+ repoName);
        System.out.println("Author: "+ repoAuthor);
        System.out.println("Description: "+ descriptionOfRepo);
        System.out.println("Stars: "+ repoStars);
    }

    private JSONObject deeperObject(JSONObject object) {
        JSONObject newObject = null;
        try {
            newObject = object.getJSONObject("owner");
        } catch (JSONException e){
            e.printStackTrace();
        }
        return newObject;
    }

    private String getStringValueFromJsonObject(JSONObject object, String stringName) {
        String value = "empty";
        try {
             value = object.getString(stringName);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return value;
    }
}
