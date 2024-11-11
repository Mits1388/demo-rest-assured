package by.dominos;


public class LoginRequest {

    public static final String URL_LOGIN = "https://dominos.by/api/v1/auth/login/phone/";

    public static String getBody(String phone) {
        return "{\"recaptcha\":\"03AFcWeA4EvWai3-PXUU0w3Gcn1V422jSjhUSYlyUAtJiDkFA-lGAhHEgJBli2qn8CG-0WZG6QA665LP-AHJJgvSpIqFBQSX30C4hbW480va-3do16csHikuS3Gryjrb8mF2azEvULayPjVF8UGHT6c_5GsvlvVLryv2DNy05oYvaDAd_HQj80jKHbowEuybvdk-ET6YGD3Gxuv5tXUk896hFb7L8iFscFRahuLfl4oOZed6E0o3Uxf8Aks1fyTHCM-npiSlCe2hs1ErBZ4hBTEUFne2i21f4DAXrNpJfJnqf5tQ5LvI3GBFjmG0VKa9JEB8_W_mpbSBWCu84oi19qD8P2kDdiE1YULKwAtAM5wu7Gjz6SjwyQY1FL-w_We8V4KyI1AdjeNONgQayo4Hp1KHnwkZwsQf-7e6StmnKu9OenB-eThbilDXAbHybO_EQH0U7mu8-Ydekf0XuzrjvbXr-51czHImEY2U4FbAbsM6CcLY4XnPren-HmoHjfjz5cPnrzQ1eft-gm-4hLDdzhC3BU-YKIHF0GKQ9brVXdqjgEQYUd-_Z38vsYfYENFf1_zHsfg8rJKa_9BeiLK386fixXQbdq8Y3ZFet60evGIuOgJRlJzygESBnFgLha5xyzt8765qnD-l7OBsdazqc--ToN8L9HjTpRb-sBqn-k0_FlwRgqdzq_HHtsWZMn3vDsLrV3HTN4puV8D2dWO0LjGJzK8jHSmhCb1KJctFUPZ4WmImrOoKfrRaRAwfiuYFCH4xvv3AHqE37tgEzzr9cWOqWAv-6xNzULpEBttf0d7SGwQ8DN8uKG4m-KkPqo1Nx6-66pza1fToVi0P_8iyqnvqueSDR93y70NQ\",\"phone\":\""+phone+"\"}";
    }
}
