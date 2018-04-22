package com.kpfu.pm.coffeehouse.service;

import com.kpfu.pm.coffeehouse.dto.OrderDto;

public interface OrderService {


    void createOrder(OrderDto orderDto);
}
