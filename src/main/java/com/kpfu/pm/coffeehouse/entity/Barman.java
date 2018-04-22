package com.kpfu.pm.coffeehouse.entity;


import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import javax.persistence.*;

@Entity
@Polymorphism(type = PolymorphismType.EXPLICIT)
@Table(name="barman")
public class Barman extends User {

    @ManyToOne
    @JoinColumn(name="coffeehouse")
    CoffeeHouse coffeeHouse;




}
