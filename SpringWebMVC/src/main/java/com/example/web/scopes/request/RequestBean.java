package com.example.web.scopes.request;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestBean {
    // Tak nie robimy! Takie dane lepiej trzymać w bazie danych!
    private int counter = 0;

    // counter nie zadziała, ponieważ każdy request stworzy nową instancę tego bean i zainicjalizuje counter = 0
    public int count() {
        return ++counter;
    }
}