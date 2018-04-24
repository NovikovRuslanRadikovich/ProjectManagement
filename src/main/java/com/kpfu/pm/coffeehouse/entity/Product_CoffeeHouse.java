package com.kpfu.pm.coffeehouse.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "product_coffeehouse")
public class Product_CoffeeHouse extends AbstractEntity{

    @Column(name = "product_id")
    private long productId;

    @Column(name = "coffeehouse_id")
    private long coffeehouseId;

}
