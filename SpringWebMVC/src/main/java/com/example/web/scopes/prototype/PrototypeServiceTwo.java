package com.example.web.scopes.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class PrototypeServiceTwo {
    private final PrototypeBean bean;

    @Autowired
    PrototypeServiceTwo(PrototypeBean bean) {
        this.bean = bean;
    }

    @Override
    public String toString() {
        return "PrototypeServiceTwo{" +
                "bean=" + bean +
                '}';
    }
}