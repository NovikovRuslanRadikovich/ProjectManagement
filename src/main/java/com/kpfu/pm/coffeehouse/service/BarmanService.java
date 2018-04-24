package com.kpfu.pm.coffeehouse.service;

import com.kpfu.pm.coffeehouse.dto.BarmanDto;
import com.kpfu.pm.coffeehouse.dto.response.BarmanResponseDto;
import com.kpfu.pm.coffeehouse.entity.Barman;

import java.util.List;

public interface BarmanService {


    void createBarman(BarmanDto barmanDto,long coffeehouseId);

    List<BarmanResponseDto> getAllByCoffeeHouse(long coffeeHouseId);

    Barman findOneById(long barmanId);

    void deleteBarman(long id);
}
