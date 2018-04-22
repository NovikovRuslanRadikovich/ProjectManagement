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
@Table(name = "products")
public class Product extends AbstractEntity{

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="product_order", joinColumns = {
            @JoinColumn(name = "product_id",nullable = true, updatable = false) },
            inverseJoinColumns = {@JoinColumn(name = "order_id",
            nullable = true,updatable = false)})
    private Set<Order> orders;

}
