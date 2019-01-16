package main.main.service.impl;

import main.main.service.AbstractRestClientService;
import main.main.service.inter.BookRestClientServiceInter;
import main.model.Book;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.xml.ws.Response;
import java.util.Arrays;
import java.util.List;

@Service
public class BookRestClientServiceImpl extends AbstractRestClientService implements BookRestClientServiceInter {

    @Override
    public List<Book> getAllBook() {
        ResponseEntity<Book[]> response = template.getForEntity("/book" , Book[].class);
        Book[] books  = response.getBody();

        return Arrays.asList(books);
    }

    public void postDemoMethod(){
        HttpEntity<Object> member = getHttpEntity(
                    "{" +
                            "\"name\": \"Elon Musk\", " +
                            "\"email\": \"emuskmember@gmail.com\"," +
                            "\"membershipStatus\": \"ACTIVE\"," +
                            "\"membershipStartDate\":\"2018-12-15T12:12:12\" " +
                            "}");

      ResponseEntity<String> resp = template.postForEntity("/book",member, String.class);

    }
}
