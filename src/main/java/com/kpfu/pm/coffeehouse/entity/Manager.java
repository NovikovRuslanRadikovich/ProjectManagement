package com.kpfu.pm.coffeehouse.entity;


import lombok.*;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Polymorphism(type = PolymorphismType.EXPLICIT)
@Table(name="manager")
public class Manager extends User{

    @ManyToOne
    @JoinColumn(name="coffehouse")
    CoffeeHouse coffeeHouse;
}
