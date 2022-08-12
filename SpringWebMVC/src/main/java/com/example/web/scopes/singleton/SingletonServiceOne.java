package com.example.web.scopes.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class SingletonServiceOne {
    private final SingletonBean bean;

    @Autowired
    SingletonServiceOne(SingletonBean bean) {
        this.bean = bean;
    }

    @Override
    public String toString() {
        return "SingletonServiceOne{" +
                "bean=" + bean +
                '}';
    }
}