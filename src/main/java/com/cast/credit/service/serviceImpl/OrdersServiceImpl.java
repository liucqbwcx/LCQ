package com.cast.credit.service.serviceImpl;

import com.cast.credit.mapper.OrdersMapper;
import com.cast.credit.mapper.UserMapper;
import com.cast.credit.pojo.Orders;
import com.cast.credit.pojo.User;
import com.cast.credit.service.OrdersService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OrdersServiceImpl implements OrdersService {
//    这个@Autowired为红色但不会错@Resource也不会错
    @Autowired
    OrdersMapper ordersMapper;
    @Resource
    UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public List<Orders> getOrdersList() {
        PageHelper.startPage(1,2);//设置分页
        List<Orders> orders = ordersMapper.select(null);
        return orders;
    }
}
