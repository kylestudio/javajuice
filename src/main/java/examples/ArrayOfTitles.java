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
import java.util.Arrays;
import java.util.List;

public class ArrayOfTitles {
  /*
   * Complete the function below.
   * Base url: https://jsonmock.hackerrank.com/api/movies/search/?Title=
   */

  private static String baseUrl = "https://jsonmock.hackerrank.com/api/movies/search/";

  private static Gson gson;

  static {
    gson = new Gson();
  }

  public static JsonObject getArticlesFromServer(String title, int page) {
    try {

      URL url = new URL(baseUrl + "?Title=" + title + "&page=" + page);
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

  static String[] getMovieTitles(String substr) {

    List<String> res = new ArrayList<>();

    int currentPage = 1;
    int totalPage;
    do {
      JsonObject response = getArticlesFromServer(substr, currentPage);

      final JsonArray articles = response.get("data").getAsJsonArray();
      for (JsonElement item : articles) {
        JsonObject article = item.getAsJsonObject();
        if (article.get("Title") != null) {
          res.add(article.get("Title").getAsString());
        }
      }

      totalPage = response.get("total_pages").getAsInt();
      currentPage++;

    } while (currentPage <= totalPage);

    System.out.println(res);

    String[] array = new String[res.size()];

    array = res.toArray(array);

    Arrays.sort(array);
    return array;
  }

  public static void main(String[] args) throws IOException {
    System.out.println(getMovieTitles("spiderman"));
  }
}