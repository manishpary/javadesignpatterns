package CreationalPattern.BuilderPattern;

public class Test {
  public static void main(String[] args) {
    HttpClient httpClient = new HttpClient("GET", "https://www.google.com", null, null, null);
    HttpClient httpClient1 = new HttpClient.HttpClientBuilder().body("").url("url").build();
    System.out.println(httpClient1);
    System.out.println(httpClient);
    HttpClient.HttpClientBuilder httpClientBuilder = new HttpClient.HttpClientBuilder();
    httpClientBuilder.method("Get").body("hello").build();
  }
}
