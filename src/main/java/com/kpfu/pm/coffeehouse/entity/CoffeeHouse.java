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
@Table(name = "coffeehouses")
public class CoffeeHouse extends AbstractEntity  {

     @OneToMany(fetch = FetchType.LAZY, mappedBy = "coffeeHouse")
     Set<Manager> managers;


     @OneToMany(fetch = FetchType.LAZY,mappedBy = "coffeeHouse")
     Set<Barman> barmans;

     @OneToMany(fetch = FetchType.LAZY,mappedBy = "orderscoffeehouse")
     Set<Order> orders;

     @ManyToMany(fetch = FetchType.LAZY, mappedBy = "productscoffeeHouses")
     private Set<Product> products;

     @OneToMany(fetch = FetchType.LAZY, mappedBy = "commentscoffeeHouse")
     private Set<CoffeeHouseComment> coffeeHouseComments;

}
