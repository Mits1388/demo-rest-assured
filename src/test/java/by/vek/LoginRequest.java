package by.vek;

public class LoginRequest {
    public static final String URL_LOGIN = "https://www.21vek.by/users/action/login/";

    public static String getBody(String email, String password) {
        return "{\"User\": {\"email\": \""+email+"\",\"password\": \""+password+"\"}}";
    }
}
