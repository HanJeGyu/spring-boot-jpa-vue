package com.saram.web.controller;

import java.util.HashMap;

import com.saram.web.common.util.PageProxy;
import com.saram.web.common.util.Printer;
import com.saram.web.domain.CustomerDTO;
import com.saram.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {
        
    @Autowired CustomerService customerService;
    @Autowired CustomerDTO customer;
    @Autowired PageProxy pxy;
    @Autowired Printer p;
    
    @PostMapping("")
    // public @ResponseBody(생략됨) CustomerDTO login(@PathVariable("customerId")String id, @PathVariable("password")String pass){
    // HashMap JSON과 호환
    public HashMap<String, Object> join(){
        p.accept("POST 매핑");
        HashMap<String, Object> map = new HashMap<>();
        map.put("result", "post SUCCESS");
        return map;
    }

    @GetMapping("/count")
    public String count() {
        System.out.println("customerController.count()");
        //int count = customerService.countAll();
        int count = 100;
        p.accept("람다 고객수 : " + count);
        System.out.println("고객수 : " + count);
        return count + "";
    }

    @GetMapping("/page/{pageNum}")
    public HashMap<String, Object> customerList(@PathVariable String pageNum){
        HashMap<String, Object> map = new HashMap<>();
        map.put("totalCount",customerService.countAll());
        map.put("page_num", pageNum);
        map.put("page_size", "5");
        map.put("block_size", "5");
        pxy.execute(map);

        map.put("list", customerService.findCustomers(pxy));
        map.put("pxy", pxy);
        return map;
    }

    @GetMapping("/{customerId}/{password}")
    public CustomerDTO login(@PathVariable("customerId")String id, @PathVariable("password")String pass){
        customer.setCustomerId(id);
        customer.setPassword(pass);
        return customerService.login(customer);
    };

    @GetMapping("/{customerId}")
    public CustomerDTO findByCustomerId(@PathVariable String customerId) {
        p.accept("GET 매핑" + customerId);
        customer.setCustomerId("get han");
        return customer;
    };

    @PutMapping("/{customerId}")
    public HashMap<String, Object> modify(@PathVariable String customerId) {
        p.accept("PUT 매핑" + customerId);
        HashMap<String, Object> map = new HashMap<>();
        map.put("result", "put SUCCESS");
        return map;
    };

    @DeleteMapping("/{customerId}")
    public HashMap<String, Object> delete(@PathVariable String customerId) {
        p.accept("DELETE 매핑" + customerId);
        HashMap<String, Object> map = new HashMap<>();
        map.put("result", "delete SUCCESS");
        return map;
    };
}