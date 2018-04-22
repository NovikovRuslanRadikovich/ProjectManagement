package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.repository.OrderRepository;
import com.kpfu.pm.coffeehouse.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;


}
