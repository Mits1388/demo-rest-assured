package by.oz;

public class LoginRequest {
    public static final String URL_LOGIN = "https://auth.oz.by/api/v3/quickSignIn";

    public static String getBody(String phone) {
        return "{\"phone\": \""+phone+"\"}";
    }
}
