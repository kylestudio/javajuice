package examples;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


class Result {

  /*
   * Complete the 'getArticleTitles' function below.
   *
   * The function is expected to return a STRING_ARRAY.
   * The function accepts STRING author as parameter.
   *
   * URL for cut and paste:
   * https://jsonmock.hackerrank.com/api/articles?author=<authorName>&page=<num>
   *
   */

  private static String serverUrl = "https://jsonmock.hackerrank.com/api/articles";

  private static Gson gson;

  static {
    gson = new Gson();
  }


  public static JsonObject getArticlesFromServer(String author, int page) {
    try {

      JsonObject a = new JsonObject();
      final JsonArray asd = a.getAsJsonArray("asd");

      URL url = new URL(serverUrl + "?author=" + author + "&page=" + page);
      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      connection.setDoOutput(true);
      connection.setRequestMethod("GET");

      BufferedReader br = new BufferedReader(
          new InputStreamReader(connection.getInputStream(), "utf-8"));
      String line = null;
      StringBuilder result = new StringBuilder();
      while ((line = br.readLine()) != null) {
        result.append(line);
      }
      connection.disconnect();

      System.out.println("Returned from server: " + result.toString());

      return gson.fromJson(result.toString(), JsonObject.class);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  public static List<String> getArticleTitles(String author) {

    List<String> res = new ArrayList<>();

    int currentPage = 1;
    int totalPage;
    do {
      JsonObject response = getArticlesFromServer(author, currentPage);

      final JsonArray articles = response.get("data").getAsJsonArray();
      for (JsonElement item : articles) {
        JsonObject article = item.getAsJsonObject();
        if (article.get("title") != null) {
          res.add(article.get("title").getAsString());
        } else {
          if (article.get("story_title") != null) {
            res.add(article.get("story_title").getAsString());
          }
        }
      }

      totalPage = response.get("total_pages").getAsInt();
      currentPage++;

    } while (currentPage <= totalPage);

    return res;
  }

}

public class ListOfArticles {

  public static void main(String[] args) throws IOException {
    System.out.println(ResultGen.getArticleTitles("epaga"));

  }
}
