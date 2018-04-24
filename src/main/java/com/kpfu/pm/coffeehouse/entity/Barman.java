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
@Table(name="barman")
public class Barman extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name="coffeehouse")
    CoffeeHouse coffeeHouse;

    @OneToMany(mappedBy = "commentsbarman")
    Set<BarmanComment> barmanComments;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;
}
