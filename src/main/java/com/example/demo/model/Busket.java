package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Busket {
    private final List<Integer> items = new ArrayList<>();

    public List<Integer> addItems(List<Integer> ids) {
        items.addAll(ids);
        return items;
    }

    public List<Integer> getItems() {
        return items;
    }
}
