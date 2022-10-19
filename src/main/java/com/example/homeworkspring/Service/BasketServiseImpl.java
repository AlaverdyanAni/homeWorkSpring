package com.example.homeworkspring.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class BasketServiseImpl implements BasketService{
    private final List<Integer> products;
    public BasketServiseImpl (List<Integer> products){
        this.products=products;
    }

    @Override
    public void add(List<Integer>productsId) {
        for (int i = 0; i < productsId.size(); i++) {
            if (productsId.get(i)>0){
                products.addAll(productsId);
            }
        }
    }

     @Override
     public List<Integer> get(){
     return products;
}
}
