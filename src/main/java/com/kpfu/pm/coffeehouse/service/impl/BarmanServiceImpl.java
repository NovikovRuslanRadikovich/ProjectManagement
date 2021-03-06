package com.kpfu.pm.coffeehouse.service.impl;

import com.kpfu.pm.coffeehouse.dto.BarmanDto;
import com.kpfu.pm.coffeehouse.dto.response.BarmanResponseDto;
import com.kpfu.pm.coffeehouse.entity.Barman;
import com.kpfu.pm.coffeehouse.entity.CoffeeHouse;
import com.kpfu.pm.coffeehouse.repository.BarmanRepository;
import com.kpfu.pm.coffeehouse.service.BarmanService;
import com.kpfu.pm.coffeehouse.service.CoffeeHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BarmanServiceImpl implements BarmanService {

    @Autowired
    BarmanRepository barmanRepository;

    @Autowired
    CoffeeHouseService coffeeHouseService;

    @Override
    public void createBarman(BarmanDto barmanDto,long coffeehouseId) {
           Barman barman = new Barman();
           barman.setName(barmanDto.getName());
           barman.setSurname(barmanDto.getSurname());
           CoffeeHouse coffeeHouse = coffeeHouseService.findOneById(coffeehouseId);
           barman.setCoffeeHouse(coffeeHouse);

           barmanRepository.save(barman);
    }

    @Override
    public List<BarmanResponseDto> getAllByCoffeeHouse(long coffeeHouseId) {
        CoffeeHouse coffeeHouse = coffeeHouseService.findOneById(coffeeHouseId);
        return coffeeHouse.getBarmans().stream().map(this::toProductResponseDto).
                collect(Collectors.toList());
    }

    @Override
    public Barman findOneById(long barmanId) {
       return barmanRepository.findOneById(barmanId);
    }

    @Override
    public void deleteBarman(long id) {
        barmanRepository.deleteById(id);
    }

    BarmanResponseDto toProductResponseDto(Barman barman) {
        BarmanResponseDto barmanResponseDto = new BarmanResponseDto();
        barmanResponseDto.setId(barman.getId());
        barmanResponseDto.setName(barman.getName());
        barmanResponseDto.setSurname(barman.getSurname());
        return barmanResponseDto;
    }




}
