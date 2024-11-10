package by.bypet;

public class LoginRequest {
    public static final String URL_LOGIN = "https://bypet.by/auth/login";

    public static String getBody(String phoneStripped) {
        return "\"phone_stripped\":\"" + phoneStripped + "\",\n" +
                "\"phone\":\"+375 (29) 856-40-32\",\n" +
                "\"password\":\"eqweqweqw\"";
    }
}
