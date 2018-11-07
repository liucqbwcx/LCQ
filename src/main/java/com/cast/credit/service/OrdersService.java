package com.cast.credit.service;

import com.cast.credit.pojo.Orders;
import com.cast.credit.pojo.User;

import java.util.List;

public interface OrdersService {
    User getUserById(Integer id);
    List<User> getUserList();
    List<Orders> getOrdersList();
}
