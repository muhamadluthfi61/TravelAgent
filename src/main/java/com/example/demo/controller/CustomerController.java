package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/customer")
    public String CustomerList(Model model)
    {
        model.addAttribute("customer", customerService.listCustomer());
        return "customer";
    }

    @RequestMapping(value = "/customer/create", method = RequestMethod.GET)
    public String CustomerForm(Model model)
    {
        model.addAttribute("customer", new Customer());
        return "formCustomer";
    }

    @RequestMapping(value = "/customer/create", method = RequestMethod.POST)
    public String CustomerAdd(Model model, Customer customer)
    {
        model.addAttribute("customer", customerService.saveOrUpdateCustomer(customer));
        return "redirect:/customer";
    }

    @RequestMapping(value = "/customer/edit/{id}", method = RequestMethod.GET)
    public String CustomerEdit(@PathVariable int id, Model model)
    {
        model.addAttribute("customer", customerService.getIdCustomer(id));
        return "formCustomer";
    }

    @RequestMapping(value = "/customer/delete/{id}")
    public String CustomerDelete(@PathVariable int id)
    {
        customerService.deleteCustomer(id);
        return "redirect:/customer";
    }
}
