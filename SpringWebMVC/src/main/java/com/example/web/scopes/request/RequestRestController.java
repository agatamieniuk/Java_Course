package com.example.web.scopes.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/scope/request")
public class RequestRestController {

    private final RequestBean requestBean;

    @Autowired
    public RequestRestController(RequestBean requestBean) {
        this.requestBean = requestBean;
    }

    @GetMapping
    public Integer request() {
        return requestBean.count();
    }

}