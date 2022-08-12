package com.example.web.scopes.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class PrototypeServiceOne {
    private final PrototypeBean bean;

    @Autowired
    PrototypeServiceOne(PrototypeBean bean) {
        this.bean = bean;
    }

    @Override
    public String toString() {
        return "PrototypeServiceOne{" +
                "bean=" + bean +
                '}';
    }
}