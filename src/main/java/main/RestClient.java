package main;

import main.main.service.inter.BookRestClientServiceInter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class RestClient {


    public static void main(String[] args) throws Exception {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("main");
        applicationContext.register(RestClientConfiguration.class);

        BookRestClientServiceInter restClient = applicationContext.getBean(BookRestClientServiceInter.class);
        System.out.println(restClient.getAllBook());
    }



}