package by.tabletka;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest {
    public static final String URL_LOGIN = "https://tabletka.by/ajax-request/login";

    public static Map<String,String> getHeaders(){
        Map<String,String> headers = new HashMap<>();
        headers.put("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");
        headers.put("Cookie","regionId=0; PHPSESSID=pf24qi6b47f7o4s18lvaie48qh; _csrf=38b13d81960bd53465b873203384b8f27aec6ca79435671cf21d3605610fc8cca%3A2%3A%7Bi%3A0%3Bs%3A5%3A%22_csrf%22%3Bi%3A1%3Bs%3A32%3A%22srHb-YcM9_azsQWEBIEOxB4IO2h2Sf9h%22%3B%7D");
        headers.put("X-Requested-With","XMLHttpRequest");
        return headers;
    }

    public static String getBody(){
        return "_csrf=CKuo-Ct-R-4b5Xfso9NQ2kiOwjijMKlcfWkOmDk2abx72eCaBickoyK6FpbQggefCseHd9tynRUyW2aqalBQ1A%3D%3D&email=mits1388%40gmail.com&password=weqweqweqwe";
    }
}
