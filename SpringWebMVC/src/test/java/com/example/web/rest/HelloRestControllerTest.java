package com.example.web.rest;

import com.example.web.WebApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = WebApplication.class)
@AutoConfigureMockMvc
@EnableAutoConfiguration
public class HelloRestControllerTest {

    @Autowired
    private MockMvc mvc;

    /*
     * Żadanie HTTP:
     * Metoda: GET
     * URL: http://localhost:8080/api/text/hello
     * ----------------------------
     * Oczekiwana odpowiedź:
     * Status: 200 OK
     * Typ odpowiedzi: text/html
     * Body: Hello World
     * */
    @Test
    public void shouldReturnOKGreeting() throws Exception {
        mvc.perform(get("/api/hello").contentType(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", is("Hello World")));
    }
}
