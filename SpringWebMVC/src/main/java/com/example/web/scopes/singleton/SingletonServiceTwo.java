package com.example.web.scopes.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class SingletonServiceTwo {
    private final SingletonBean bean;

    @Autowired
    SingletonServiceTwo(SingletonBean bean) {
        this.bean = bean;
    }

    @Override
    public String toString() {
        return "SingletonServiceTwo{" +
                "bean=" + bean +
                '}';
    }
}