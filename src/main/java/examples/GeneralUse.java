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


class ResultGen {

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

  public static void foo(boolean a, boolean b) {
    if (a) {
      System.out.println("A");
    } else if (a && b) {
      System.out.println("A && B");
    } else {
      if (!b) {
        System.out.println("notB");
      } else {
        System.out.println("ELSE");
      }
    }
  }

  public static void add(int a) {
    loop:
    for (int i = 1; i < 3; i++) {
      for (int j = 1; j < 3; j++) {
        if (a == 5) {
          break loop;
        }
        System.out.println(i * j);
      }
    }
  }
}

class Ecs0 extends Exception {

}

class Exc1 extends Ecs0 {

}

class A {

};

class B extends A {

}

class C extends B {

}

public class GeneralUse {

  public static void main(String[] args) throws IOException {
//    System.out.println(Result.getArticleTitles("epaga"));
//
//    Result.foo(true, true);
//    Result.foo(true, false);
//    Result.foo(false, true);
//    Result.foo(false, false);
//
//    try {
//      throw new Exc1();
//    } catch (Ecs0 e) {
//      System.out.println("0");
//    } catch (Exception e) {
//      System.out.println("ee");
//    }
//    B b = new B();
//    System.out.println(""+(b instanceof  B));
//    System.out.println(""+((b instanceof  B)&&(!(b instanceof A))));
//    System.out.println(""+((b instanceof  B)&&(!(b instanceof C))));

    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = true;

    if (b1 && b2 || b2 && b3 || b2) {
      System.out.print("ok ");
    }
    if (b1 && b2 || b2 && b3 || b2 || b1) {
      System.out.println("dokey");
    }

  }
}
