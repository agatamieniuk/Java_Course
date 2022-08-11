package com.example.web.rest;

import com.example.web.WebApplication;
import com.example.web.dto.ProductDto;
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
public class ProductRestControllerTest {

    @Autowired
    private ObjectMapper om;

    @Autowired
    private MockMvc mvc;


    /*
     * Żadanie HTTP:
     * Metoda: GET
     * URL: http://localhost:8080/api/products/clothes/best
     * ----------------------------
     * Oczekiwana odpowiedź:
     * Status: 200 OK
     * Typ odpowiedzi: application/json
     * Body:
     * {
     *   "id": 1,
     *   "name": "best product"
     * }
     * */
    @Test
    public void shouldReturnBest() throws Exception {
        mvc.perform(get("/api/products/clothes/best")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.name", is("best product")));
    }

    /*
     * Żadanie HTTP:
     * Metoda: GET
     * URL: http://localhost:8080/api/products/clothes/t-shirts/5
     * ----------------------------
     * Oczekiwana odpowiedź:
     * Status: 200 OK
     * Typ odpowiedzi: application/json
     * Body:
     * {
     *   "id": 5,
     *   "name": "cool t-shirt"
     * }
     * */
    @Test
    public void shouldReturnTShirtById() throws Exception {
        int id = 5;
        mvc.perform(get("/api/products/clothes/t-shirts/" + id)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(id)))
                .andExpect(jsonPath("$.name", is("cool t-shirt")));
    }

    /*
     * Żadanie HTTP:
     * Metoda: GET
     * URL: http://localhost:8080/api/products/clothes/t-shirts/5?text=some text
     * ----------------------------
     * Oczekiwana odpowiedź:
     * Status: 200 OK
     * Typ odpowiedzi: application/json
     * Body:
     * {
     *   "id": 5,
     *   "name": "some text"
     * }
     * */
    @Test
    public void shouldReturnTShirtByIdWithSpecifiedText() throws Exception {
        int id = 5;
        String text = "some text";
        mvc.perform(get("/api/products/clothes/t-shirts/" + id + "?text=" + text)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(id)))
                .andExpect(jsonPath("$.name", is(text)));
    }

    /*
     * Żadanie HTTP:
     * Metoda: POST
     * URL: http://localhost:8080/api/products/clothes/t-shirts
     * Typ żądania: application/json
     * Body:
     * {
     *   "id": 6,
     *   "name": "some different text"
     * }
     * ----------------------------
     * Oczekiwana odpowiedź:
     * Status: 200 OK
     * Typ odpowiedzi: application/json
     * Body:
     * {
     *   "id": 6,
     *   "name": "some different text"
     * }
     * */
    @Test
    public void shouldReturnSavedProduct() throws Exception {
        ProductDto productDto = new ProductDto();
        productDto.setId(6L);
        productDto.setName("some different text");
        mvc.perform(post("/api/products/clothes/t-shirts")
                        .content(om.writeValueAsString(productDto))
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id", is(productDto.getId().intValue())))
                .andExpect(jsonPath("$.name", is(productDto.getName())));
    }
}
