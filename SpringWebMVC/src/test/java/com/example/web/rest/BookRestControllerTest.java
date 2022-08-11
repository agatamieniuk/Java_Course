package com.example.web.rest;

import com.example.web.WebApplication;
import com.example.web.dto.BookDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = WebApplication.class)
@AutoConfigureMockMvc
@EnableAutoConfiguration
public class BookRestControllerTest {

    @Autowired
    private ObjectMapper om;

    @Autowired
    private MockMvc mvc;


    /*
     * Żadanie HTTP:
     * Metoda: GET
     * URL: http://localhost:8080/api/products/books/best
     * ----------------------------
     * Oczekiwana odpowiedź:
     * Status: 200 OK
     * Typ odpowiedzi: application/json
     * Body:
     * {
     *   "isbn": 1,
     *   "title": "best book"
     * }
     * */
    @Test
    public void shouldReturnBest() throws Exception {
        mvc.perform(get("/api/products/books/best")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.isbn", is(1)))
                .andExpect(jsonPath("$.title", is("best book")));
    }

    /*
     * Żadanie HTTP:
     * Metoda: GET
     * URL: http://localhost:8080/api/products/books/novels/13
     * ----------------------------
     * Oczekiwana odpowiedź:
     * Status: 200 OK
     * Typ odpowiedzi: application/json
     * Body:
     * {
     *   "isbn": 13,
     *   "title": "cool novel"
     * }
     * */
    @Test
    public void shouldReturnBookById() throws Exception {
        int id = 13;
        mvc.perform(get("/api/products/books/novels/" + id)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.isbn", is(id)))
                .andExpect(jsonPath("$.title", is("cool novel")));
    }

    /*
     * Żadanie HTTP:
     * Metoda: GET
     * URL: http://localhost:8080/api/products/books/novels/14?tytul=bookbook
     * ----------------------------
     * Oczekiwana odpowiedź:
     * Status: 200 OK
     * Typ odpowiedzi: application/json
     * Body:
     * {
     *   "isbn": 14,
     *   "title": "bookbook"
     * }
     * */
    @Test
    public void shouldReturnBookByIdWithSpecifiedText() throws Exception {
        int id = 14;
        String text = "bookbook";
        mvc.perform(get("/api/products/books/novels/" + id + "?tytul=" + text)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.isbn", is(id)))
                .andExpect(jsonPath("$.title", is(text)));
    }

    /*
     * Żadanie HTTP:
     * Metoda: POST
     * URL: http://localhost:8080/api/products/books/novels
     * Typ żądania: application/json
     * Body:
     * {
     *   "isbn": 15,
     *   "title": "some different title"
     * }
     * ----------------------------
     * Oczekiwana odpowiedź:
     * Status: 200 OK
     * Typ odpowiedzi: application/json
     * Body:
     * {
     *   "isbn": 15,
     *   "title": "some different title"
     * }
     * */
    @Test
    public void shouldReturnSavedBook() throws Exception {
        BookDto bookDto = new BookDto();
        bookDto.setIsbn(15);
        bookDto.setTitle("some different title");
        mvc.perform(post("/api/products/books/novels")
                        .content(om.writeValueAsString(bookDto))
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.isbn", is(bookDto.getIsbn())))
                .andExpect(jsonPath("$.title", is(bookDto.getTitle())));
    }
}
