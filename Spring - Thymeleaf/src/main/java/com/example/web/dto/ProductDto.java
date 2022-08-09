package com.example.web.dto;

import javax.validation.constraints.Size;
import java.time.LocalDate;

public class ProductDto {
    private Integer id;
    @Size(min = 2, max = 10)
    private String name;
    @Size(min = 5)
    private String desc;
    private LocalDate created;
    private String color;
    private Boolean isEcommerce;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getEcommerce() {
        return isEcommerce;
    }

    public void setEcommerce(Boolean ecommerce) {
        isEcommerce = ecommerce;
    }
}
