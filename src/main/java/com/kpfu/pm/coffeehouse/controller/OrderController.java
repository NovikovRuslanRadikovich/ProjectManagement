package com.kpfu.pm.coffeehouse.controller;


import com.kpfu.pm.coffeehouse.dto.OrderDto;
import com.kpfu.pm.coffeehouse.service.OrderService;
import com.kpfu.pm.coffeehouse.util.ApiResponse;
import com.kpfu.pm.coffeehouse.util.ResponseCreator;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController extends ResponseCreator {

    @Autowired
    private OrderService orderService;

    @ApiImplicitParam(name = "Authorization", paramType = "header", required = true, dataType = "string")
    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public ResponseEntity<ApiResponse<String>> createOrder(@RequestBody OrderDto orderDto) {
        orderService.createNewOrder(orderDto);
        return createGoodResponse();
    }


}
