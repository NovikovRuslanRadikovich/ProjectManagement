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
@Table(name="manager")
public class Manager extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name="coffehouse")
    CoffeeHouse coffeeHouse;
}
