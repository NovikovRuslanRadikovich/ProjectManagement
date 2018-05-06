package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.converter.OrderConverter;
import com.kpfu.pm.coffeehouse.dto.OrderDto;
import com.kpfu.pm.coffeehouse.dto.response.OrderResponseDto;
import com.kpfu.pm.coffeehouse.entity.CoffeeHouse;
import com.kpfu.pm.coffeehouse.entity.Order;
import com.kpfu.pm.coffeehouse.repository.OrderRepository;
import com.kpfu.pm.coffeehouse.service.CoffeeHouseService;
import com.kpfu.pm.coffeehouse.service.OrderService;
import com.kpfu.pm.coffeehouse.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    SecurityService securityService;

    @Autowired
    CoffeeHouseService coffeeHouseService;

    @Autowired
    OrderConverter orderConverter;
    
    @Override
    public void createOrder(OrderDto orderDto) {
        Order order = new Order();
        order.setOrdersowner(securityService.getCurrentUser());
        long coffeehouseId = orderDto.getOrders_coffeehouse_id();
        order.setOrderscoffeehouse(coffeeHouseService.findOneById(coffeehouseId));
    }

    @Override
    public List<OrderResponseDto> getAllByCoffeeHouse(long coffeeHouseId) {
        CoffeeHouse coffeeHouse = coffeeHouseService.findOneById(coffeeHouseId);
        return coffeeHouse.getOrders().stream().map(orderConverter::doForward).
                collect(Collectors.toList());
    }
    
}
