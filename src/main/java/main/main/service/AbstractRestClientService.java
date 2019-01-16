package main.main.service;

import main.SecurityDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


public abstract class AbstractRestClientService {

    @Autowired
    protected RestTemplate template;

//    private HttpHeaders getHeaders(){
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.set("Authorization", "Bearer "+ SecurityDetails.getAccessToken());
//        return headers;
//    }

    protected HttpEntity<Object> getHttpEntity(Object body) {
        HttpHeaders headers = new HttpHeaders();
        return new HttpEntity<Object>(body, headers);
    }
}
