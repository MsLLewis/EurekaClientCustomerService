package com.lewis.eurekaclientcustomerservice;


import com.lewis.eurekaclientcustomerservice.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerServiceController {

    @GetMapping("/")
    public String home(){
        return "Eureka Client Application Running";
    }

    @GetMapping("/listcustomer/{id}")
    public Customer getCustomer(@PathVariable int id){
        List<Customer> custOne =  new ArrayList<>();

        Customer ctd1 = new Customer(1, "Morgan", "Laptop");
        Customer ctd2 = new Customer(2, "Angela", "Desktop");
        Customer ctd3 = new Customer(3, "Christopher", "MacBook");
        Customer ctd4 = new Customer(4, "Matthew", "iPad");
        custOne.add(ctd1);
        custOne.add(ctd2);
        custOne.add(ctd3);
        custOne.add(ctd4);
        for(Customer cust: custOne){
            if(id == cust.getId()){
                return cust;
            }
        }

        return null;
    }

    @GetMapping("/allcustomers")
    public List<Customer> list(){
        List<Customer> allcust =  new ArrayList<>();

        Customer ctd1 = new Customer(1, "Morgan", "Laptop");
        Customer ctd2 = new Customer(2, "Angela", "Desktop");
        Customer ctd3 = new Customer(3, "Christopher", "MacBook");
        Customer ctd4 = new Customer(4, "Matthew", "iPad");

        allcust.add(ctd1);
        allcust.add(ctd2);
        allcust.add(ctd3);
        allcust.add(ctd4);

        return allcust;

    }

    @GetMapping("/addcustomer/{id}")
    public String addCustomer(@PathVariable int id){
        Customer newcust = new Customer(id, "Lisa", "Unix License");
        return "New Customer" + newcust.toString();
    }
}
