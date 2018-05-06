package com.kpfu.pm.coffeehouse.repository;

import com.kpfu.pm.coffeehouse.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {




}
