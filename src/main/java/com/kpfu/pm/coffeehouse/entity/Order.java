package com.kpfu.pm.coffeehouse.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "orders")
public class Order extends AbstractEntity {

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "orders")
    private Set<Product> products;

    @ManyToOne
    @JoinColumn(name = "ordersowner")
    User ordersowner;

    @ManyToOne
    @JoinColumn(name = "orderscoffeehouse")
    CoffeeHouse orderscoffeehouse;


    @Enumerated(EnumType.STRING)
    private OrderState orderState;



}
