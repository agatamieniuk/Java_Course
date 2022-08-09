package com.example.web.dto;

import com.example.web.enums.Color;

import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

public class ProductDto {
    private Integer id;
    @Size(min = 2, max = 10)
    private String name;
    @Size(min = 10)
    private String desc;
    private LocalDate created;
    private Color color;
    private Boolean isEcommerce;
    private List<String> elements;


    public List<String> getElements() {
        return elements;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }

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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Boolean getEcommerce() {
        return isEcommerce;
    }

    public void setEcommerce(Boolean ecommerce) {
        isEcommerce = ecommerce;
    }
}