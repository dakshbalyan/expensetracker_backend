package com.personal.expensetracker.controller;

import com.personal.expensetracker.entity.User;
import com.personal.expensetracker.enums.Category;
import com.personal.expensetracker.enums.PaymentChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/categories")
    public List<Category> getCategoryList(){
        return new ArrayList<>();
    }
    @GetMapping("/paymentChannel")
    public List<PaymentChannel> gePaymentChannelList(){
        return new ArrayList<>();
    }
    @GetMapping("/users")
    public List<User> getUserList(){
        return new ArrayList<>();
    }
    @PostMapping("/add/category")
    public void addCategory(){}

    public void addUser(){}
}
