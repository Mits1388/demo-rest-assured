package ru.dtf;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest {
    public static final String URL_LOGIN = "https://api.dtf.ru/v3.4/auth/email/login";

    public static String getBody (){
        return "email:mits1388@gmail.com\n" +
                "password:rterterter";
    }

    public static Map<String, String> getFormData(){
        Map<String,String> formData = new HashMap<>();
        formData.put("email","mits1388@gmail.com");
        formData.put("password","rterterter");
        return formData;
    }
}
