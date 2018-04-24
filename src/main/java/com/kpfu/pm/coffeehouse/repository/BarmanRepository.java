package com.kpfu.pm.coffeehouse.repository;

import com.kpfu.pm.coffeehouse.entity.Barman;
import com.kpfu.pm.coffeehouse.entity.CoffeeHouse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BarmanRepository extends JpaRepository<Barman,Long> {

    List<Barman> getAllByCoffeeHouse(CoffeeHouse coffeeHouse);

    Barman findOneById(long barmanId);

    Barman save(Barman barman);

    void deleteById(long id);
}
