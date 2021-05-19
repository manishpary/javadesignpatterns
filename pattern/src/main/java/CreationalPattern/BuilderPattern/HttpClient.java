package CreationalPattern.BuilderPattern;

public class HttpClient {

  private final String method;
  private final String url;
  private final String userName;
  private final String passWord;
  private final String body;

  public HttpClient(String method, String url, String userName, String passWord, String body) {
    this.method = method;
    this.url = url;
    this.userName = userName;
    this.passWord = passWord;
    this.body = body;
  }

  public HttpClient(HttpClientBuilder httpClientBuilder) {
    this.method = httpClientBuilder.method;
    this.url = httpClientBuilder.url;
    this.userName = httpClientBuilder.userName;
    this.passWord = httpClientBuilder.passWord;
    this.body = httpClientBuilder.body;
  }

  @Override
  public String toString() {
    return "HttpClient{"
        + "method='"
        + method
        + '\''
        + ", url='"
        + url
        + '\''
        + ", userName='"
        + userName
        + '\''
        + ", passWord='"
        + passWord
        + '\''
        + ", body='"
        + body
        + '\''
        + '}';
  }

  public static class HttpClientBuilder {
    private String method;
    private String url;
    private String userName;
    private String passWord;
    private String body;

    public HttpClientBuilder method(String method) {
      this.method = method;
      return this;
    }

    public HttpClientBuilder url(String url) {
      this.url = url;
      return this;
    }

    public HttpClientBuilder userName(String userName) {
      this.userName = userName;
      return this;
    }

    public HttpClientBuilder password(String password) {
      this.passWord = password;
      return this;
    }

    public HttpClientBuilder body(String body) {
      this.body = body;
      return this;
    }

    public HttpClient build() {
      return new HttpClient(this);
    }
  }
}
