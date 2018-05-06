package com.kpfu.pm.coffeehouse.service;

import com.kpfu.pm.coffeehouse.dto.OrderDto;
import com.kpfu.pm.coffeehouse.dto.response.OrderResponseDto;
import com.kpfu.pm.coffeehouse.dto.response.ProductResponseDto;

import java.util.List;

public interface OrderService {

    List<OrderResponseDto> getAllByCoffeeHouse(long coffeeHouseId);

    void createOrder(OrderDto orderDto);

}
