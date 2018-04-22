package com.kpfu.pm.coffeehouse.repository;


import com.kpfu.pm.coffeehouse.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
