package com.personal.expensetracker.controller;

import com.personal.expensetracker.dto.GenericDTO;
import com.personal.expensetracker.entity.Account;
import com.personal.expensetracker.entity.Dues;
import com.personal.expensetracker.entity.Expense;
import com.personal.expensetracker.entity.User;
import com.personal.expensetracker.enums.PaymentChannel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExpenseController {

    @GetMapping("/paymentChannel")
    public List<PaymentChannel> getPaymentChannelList(){
        return new ArrayList<>();
    }
    @GetMapping("/users")
    public List<User> getUserList(){
        return new ArrayList<>();
    }
    @PostMapping("/createUser")
    public void createUserAccount(){}
    @PostMapping("/account/expenses")
    public List<Expense> getExpensesByAccount(@RequestBody GenericDTO genericDto){
        return new ArrayList<>();
    }
    @PostMapping("/account/dues")
    public List<Dues> getDuesByAccount(@RequestBody GenericDTO genericDto){
        return new ArrayList<>();
    }

    @PostMapping("/account/settle")
    public void settleDues(@RequestBody GenericDTO reqObjSettlement){

    }

    @DeleteMapping("user")
    public void deleteUser(@RequestBody GenericDTO reqObjDeleteUser){

    }
    @PostMapping("createExpense")
    public void addExpense(@RequestBody GenericDTO reqObjExpense){}

    @PostMapping("createDue")
    public void addDue(@RequestBody GenericDTO reqObjDues){}

    @PostMapping("addAmount")
    public void updateAmount(@RequestBody GenericDTO reqObjAmt){}

    @PostMapping("account/details")
    public Account getAccountDetails(@RequestBody GenericDTO reqObjAccount){
        return new Account();
    }

}
