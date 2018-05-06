package com.kpfu.pm.coffeehouse.repository;

import com.kpfu.pm.coffeehouse.entity.Product_CoffeeHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Product_CoffeeHouseRepository extends JpaRepository<Product_CoffeeHouse,Long> {

//    @Query("DELETE from product_coffeehouse WHERE productId = ? AND coffeehouse_id = ? ",productId,coffeehouseId)
//    void deleteProduct_CoffeeHouseByProductIdAndCoffeeHouseId(long productId,long coffeehouseId);

}
