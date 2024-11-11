package net.zaycev;

public class LoginRequest {
    public static final String URL_LOGIN = "https://zaycev.net/api/external/auth/login";

    public static String getBody(String email, String password) {
        return "{\"emailOrLogin\": \""+email+"\",\"password\": \""+password+"\"}";
    }
}
