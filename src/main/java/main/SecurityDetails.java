package main;

public class SecurityDetails {
    private static String accessToken;

    public static String getAccessToken(){
        return accessToken;
    }

    public static void setAccessToken(String token){
        SecurityDetails.accessToken = token;
    }
}
