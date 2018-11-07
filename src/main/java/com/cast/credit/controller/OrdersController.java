package com.cast.credit.controller;

import com.cast.credit.pojo.Orders;
import com.cast.credit.pojo.User;
import com.cast.credit.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class OrdersController {
    @Autowired
    OrdersService ordersService;
    @RequestMapping("/orders/list")
    @ResponseBody
    public List<Orders> getOrdersList(){
        return ordersService.getOrdersList();
    }
//    http://localhost:8080/orders/user/3
    @RequestMapping("/orders/user/{id}")
    public User getUserById(@PathVariable Integer id){
        return ordersService.getUserById(id);
    }
//    http://localhost:8080/orders/user?id=3&username="nishi"
    @RequestMapping(value = "/orders/user",params = {"id","username"})
    public User getUserByIdOrUsername(@RequestParam Integer id,@RequestParam String username){
        System.out.println(id+"............."+username);
        return ordersService.getUserById(id);
    }
}
