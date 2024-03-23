package com.example.demo.service;

import com.example.demo.model.Busket;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements  OrderService {

    private final Busket busket;

    public OrderServiceImpl(Busket busket) {
        this.busket = busket;
    }

    @Override
    public List<Integer> getItems() {
        return busket.getItems();
    }
    @Override
    public List<Integer> addItems(List<Integer> ids) {
        return busket.addItems(ids);
    }


}
